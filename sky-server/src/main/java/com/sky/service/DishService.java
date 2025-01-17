package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;

import java.util.List;

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

    /**
     * 菜品分页查询
     * @param dishPageQueryDTO
     * @return
     */
    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);
    /**
     * 批量删除菜品
     * @param ids
     * @return
     */
    void delete(List<Long> ids);
    /**
     * 根据id查询菜品和对应的口味数据
     * @param id
     * @return
     */
    DishVO getByIdWithFlavor(Long id);

    /**
     * 根据id修改菜品信息和对应的口味信息
     * @param dishDTO
     * @return
     */
    void updateWithFlavor(DishDTO dishDTO);
}
