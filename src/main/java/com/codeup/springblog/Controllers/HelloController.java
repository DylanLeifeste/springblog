package com.codeup.springblog.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello there! - Obi Wan";
    }

    @GetMapping("/goodbye")
    @ResponseBody
    public String goodbye(){
        return "Where are youuuu?!! - General Grievous";
    }

//    @GetMapping("/hello/{name}")
//    @ResponseBody
//    public String sayHello(@PathVariable String name) {
//        return "Hello" + name;
//    }

    @GetMapping("/book/{id}")
    @ResponseBody
    public String getBook(@PathVariable Long id){
        return "Viewing book " + id;
    }

    @RequestMapping(path = "hello/{name}", method = RequestMethod.GET)
    @ResponseBody
    public String sayHello(@PathVariable String name) {
        return "Hello " + name;
    }

}
