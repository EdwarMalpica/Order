package online.grupo3devops.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTOFrontFE {
    private List<FoodItemDTO> foodItemDTOList;
    private Long userId;
    private Long restaurantId;

}
