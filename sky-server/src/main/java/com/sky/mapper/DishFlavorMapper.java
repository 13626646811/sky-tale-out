package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName: DishFlavorMapper
 * Package: com.sky.mapper
 * Description:
 *
 * @Author clf
 * @Create 2024/11/20 14:55
 * @Version 1.0
 */
@Mapper
public interface DishFlavorMapper {

    /**
     * 批量插入
     *
     * @param flavors
     */
    void insertBatch(List<DishFlavor> flavors);

    /**
     *根据菜品id删除对应口味数据
     * @param dishId
     */
    @Delete("delete  from  dish_flavor where  dish_id = #{dishId}")
    void deleteByDishId(Long dishId);
}
