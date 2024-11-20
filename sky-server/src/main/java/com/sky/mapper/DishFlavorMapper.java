package com.sky.mapper;

import com.sky.entity.DishFlavor;
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
}
