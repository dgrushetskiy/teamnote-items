package io.khasang.teamnote.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author d.grushetskiy
 */
@Controller
public class AppController {
    @RequestMapping("/")
    public String helloPage() {
        return "document";
    }

    @RequestMapping("/items")
    public String itemsPage(){
        return "items";
    }
}
