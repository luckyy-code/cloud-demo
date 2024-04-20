package cn.cloud.service;

import cn.cloud.mapper.OrderMapper;
import cn.cloud.pojp.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    OrderMapper orderMapper;

    public Order queryOrderById(Long id){return orderMapper.findOrderById(id);}

}
