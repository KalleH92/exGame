package com.kalleH.exGamne.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GameController {


    @GetMapping("/index")
    public String index() {
        return "index";
    }
}
