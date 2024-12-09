package msa.prj.msa1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/msa1")
public class MainController {
    
    @GetMapping({"/",""})
    public String index() {
        return "index";
    }

    @GetMapping("/home")
    @ResponseBody
    public String home() {
        return "home";
    }

    @GetMapping("/test")
    public String test(){
        System.out.println("asdf");
        return "test";
    }
    
}
