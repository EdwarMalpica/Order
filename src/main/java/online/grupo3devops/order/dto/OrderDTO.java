package online.grupo3devops.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    private Long orderId;
    private List<FoodItemDTO> foodItemDTOList;
    private Restaurant restaurant;
    private UserDTO userDTO;

}
