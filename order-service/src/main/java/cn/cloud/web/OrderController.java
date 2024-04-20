package cn.cloud.web;

import cn.cloud.pojp.Order;
import cn.cloud.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/{id}")
    public Order queryById(@PathVariable("id") Long id) {

        return orderService.queryOrderById(id);
    }

}
