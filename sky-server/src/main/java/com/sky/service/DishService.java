package com.sky.service;

import com.sky.dto.DishDTO;
import org.springframework.context.annotation.Bean;

public interface DishService {
    /**
     * 新增菜品和对应口味
     * @param dishDTO
     */
    public void saveWithFlavor(DishDTO dishDTO);
}
