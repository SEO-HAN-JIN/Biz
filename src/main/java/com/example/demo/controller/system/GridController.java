package com.example.demo.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/system")
public class GridController {

    @GetMapping("/grid")
    public String grid() {
        return "system/grid";
    }
}
