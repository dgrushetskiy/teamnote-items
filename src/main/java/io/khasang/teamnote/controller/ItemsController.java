package io.khasang.teamnote.controller;

import io.khasang.teamnote.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author d.grushetskiy
 */
@Controller
@RequestMapping(value = "/items")
public class ItemsController {

    private final ItemsService itemsService;

    @Autowired
    public ItemsController(ItemsService itemsService) {
        this.itemsService = itemsService;
    }
}
