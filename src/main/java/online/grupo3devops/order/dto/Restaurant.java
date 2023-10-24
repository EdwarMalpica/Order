package online.grupo3devops.order.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {

        private Long id;
        private String name;
        private String address;
        private String city;
        private String restaurantDescription;

}
