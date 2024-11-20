package com.sky.service.impl;

import com.sky.dto.DishDTO;
import com.sky.entity.Dish;
import com.sky.entity.DishFlavor;
import com.sky.mapper.DishFlavorMapper;
import com.sky.mapper.DishMapper;
import com.sky.service.DishService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.zip.ZipEntry;

/**
 * ClassName: DishServiceImpl
 * Package: com.sky.service.impl
 * Description:
 *
 * @Author clf
 * @Create 2024/11/19 21:06
 * @Version 1.0
 */

@Service
@Slf4j
public class DishServiceImpl implements DishService {

    @Autowired
    private  DishMapper dishMapper;
    @Autowired
    private DishFlavorMapper dishFlavorMapper;

    /**
     * 新增菜品和对应的口味
     * @param dishDTO
     */
    @Transactional  //涉及2张表的修改 开启事务注解，要么都成功，要么都失败
    public  void  saveWithFlavor(DishDTO dishDTO){

        Dish dish = new Dish();
        BeanUtils.copyProperties(dishDTO,dish);

        //向菜品表插入一条数据
         dishMapper.insert(dish);
        //向口味表插入n条数据
        //获取insert语句生成的主键值
        Long dishId = dish.getId();
        List<DishFlavor> flavors = dishDTO.getFlavors();
        if(flavors!=null && !flavors.isEmpty()){

            flavors.forEach(dishFlavor -> {
                dishFlavor.setDishId(dishId);
            });
            //向口味表插入n条数据
            dishFlavorMapper.insertBatch(flavors);
        }
    }
}
