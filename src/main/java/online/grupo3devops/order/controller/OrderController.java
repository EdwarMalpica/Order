package online.grupo3devops.order.controller;

import online.grupo3devops.order.dto.OrderDTO;
import online.grupo3devops.order.dto.OrderDTOFrontFE;
import online.grupo3devops.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/order")
@CrossOrigin
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("/saveOrder")
    public ResponseEntity<OrderDTO> saveOrder(@RequestBody OrderDTOFrontFE orderDetails){
        OrderDTO orderSaveInBD = orderService.saveOrderInDB(orderDetails);
        return new ResponseEntity<>(orderSaveInBD, HttpStatus.CREATED);
    }
}
