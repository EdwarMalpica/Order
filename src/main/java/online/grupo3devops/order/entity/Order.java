package online.grupo3devops.order.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import online.grupo3devops.order.dto.FoodItemDTO;
import online.grupo3devops.order.dto.Restaurant;
import online.grupo3devops.order.dto.UserDTO;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document("order")
public class Order {
    private Long orderId;
    private List<FoodItemDTO> foodItemList;
    private Restaurant restaurant;
    private UserDTO userDTO;

}
