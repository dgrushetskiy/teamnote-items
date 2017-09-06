package io.khasang.teamnote.controller;

import io.khasang.teamnote.entity.Items;
import io.khasang.teamnote.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @RequestMapping(value = "/add", method = RequestMethod.PUT, produces = "application/json;charset=utf-8")
    @ResponseBody
    public Items addItems(@RequestBody Items items){
        return itemsService.addItems(items);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public List<Items> getItems(){
        return itemsService.getList();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Items getById(@PathVariable(value = "id")String inputId){
        return itemsService.getById(Long.parseLong(inputId));
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    @ResponseBody
    public Items update(@RequestBody Items items){
        return itemsService.update(items);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Items delete(@PathVariable(value = "id") String inputId){
        return itemsService.delete(Long.parseLong(inputId));
    }


}
