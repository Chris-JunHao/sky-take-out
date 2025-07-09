package com.sky.service;

import com.sky.dto.DishDTO;
import com.sky.mapper.DishMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public interface DishService {

    /**
     * 新增菜品和对应口味数据
     * @param dishDTO
     */

    public void saveWithFlavor(DishDTO dishDTO);
}
