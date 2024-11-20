package com.sky.service;

import com.sky.dto.DishDTO;

/**
 * ClassName: DishService
 * Package: com.sky.service
 * Description:
 *
 * @Author clf
 * @Create 2024/11/19 21:03
 * @Version 1.0
 */
public interface DishService {

    /**
     * 新增菜品和口味
     * @param dishDTO
     */
    public void  saveWithFlavor(DishDTO dishDTO);
}
