package cn.cloud.pojp;

import lombok.Data;

@Data
public class Order {
    private Integer id;
    private Integer user_id;
    private String  name;
    private Double  price;
    private Integer num;

}
