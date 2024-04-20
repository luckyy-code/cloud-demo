package cn.cloud.mapper;

import cn.cloud.pojp.Order;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface OrderMapper {


    @Select("select * from `order` where id = #{id}")
    Order findOrderById(@Param("id") Long id);
}
