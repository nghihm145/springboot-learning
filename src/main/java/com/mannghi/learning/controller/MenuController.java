package com.mannghi.learning.controller;

import com.mannghi.learning.service.IMenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/menu")
public class MenuController {

    /*
    * inject IMenuService vao de su dung cac ham ben trong
     */
    private final IMenuService iMenuService;

    public MenuController(IMenuService iMenuService) {
        this.iMenuService = iMenuService;
    }

    @GetMapping("/get-menu")
    public String getMenu(){
        return iMenuService.getMenu();
    }

    @PostMapping("/add-menu")
    public String addMenu(){
        return iMenuService.addMenu();
    }

    @PutMapping("/update-menu")
    public String updataMenu(){
        return iMenuService.updateMenu();
    }

    @DeleteMapping("/delete-menu")
    public String deleteMenu(){
        return iMenuService.deleteMenu();
    }

    @GetMapping("/number-menu")
    public int numberMenu(){
        return iMenuService.numberMenu();
    }
    // add-menu || update-menu || delete-menu

}
