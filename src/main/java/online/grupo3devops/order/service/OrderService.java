package online.grupo3devops.order.service;

import online.grupo3devops.order.dto.OrderDTO;
import online.grupo3devops.order.dto.OrderDTOFrontFE;
import online.grupo3devops.order.dto.Restaurant;
import online.grupo3devops.order.dto.UserDTO;
import online.grupo3devops.order.entity.Order;
import online.grupo3devops.order.mapper.OrderMapper;
import online.grupo3devops.order.repo.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderService {

    @Autowired
    OrderRepo orderRepo;
    @Autowired
    SequenceGenerator sequenceGenerator;
    @Autowired
    RestTemplate restTemplate;

    public OrderDTO saveOrderInDB(OrderDTOFrontFE orderDetails){
        Long newOrderID = sequenceGenerator.generateNextOrderId();
        UserDTO userDTO = fetchUserDetailsFromUserID(orderDetails.getUserId());
        Restaurant restaurant = fetchRestauratnById(orderDetails.getRestaurantId());
        Order orderToBeSave = new Order(newOrderID, orderDetails.getFoodItemDTOList(), restaurant, userDTO);
        orderRepo.save(orderToBeSave);
        return OrderMapper.INSTANCE.mapOrderToOrderDTO(orderToBeSave);
    }

    private UserDTO fetchUserDetailsFromUserID(Long userId){
        return restTemplate.getForObject("http://USER-SERVICE/fetchById/"+userId,UserDTO.class);
    }
    private Restaurant fetchRestauratnById(Long restaurantId){
        return restTemplate.getForObject("http://RESTAURANT-SERVICE/restaurant/fetchById/"+restaurantId, Restaurant.class);
    }
}
