package com.mannghi.learning.service.impl;

import com.mannghi.learning.service.IMenuService;
import org.springframework.stereotype.Service;

@Service
public class MenuService implements IMenuService {

    @Override
    public String getMenu() {
        return "get menu";
    }

    @Override
    public String addMenu() {
        return "add menu";
    }

    @Override
    public String updateMenu() {
        return "update menu";
    }

    @Override
    public String deleteMenu() {
        return "delete menu";
    }

    @Override
    public int numberMenu() {
        return 100;
    }

}
