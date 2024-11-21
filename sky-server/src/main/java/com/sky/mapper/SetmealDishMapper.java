package com.sky.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName: SetmealDishMapper
 * Package: com.sky.mapper
 * Description:
 *
 * @Author clf
 * @Create 2024/11/21 13:57
 * @Version 1.0
 */

@Mapper
public interface SetmealDishMapper {
    /**
     * 根据菜品id查套餐id
     * @param dishIds
     * @return
     */
    List<Long> getSetmealIdsByDishIds(List<Long> dishIds);
}
