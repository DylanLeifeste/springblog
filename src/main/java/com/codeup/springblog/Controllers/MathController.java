package com.codeup.springblog.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {

    @RequestMapping(path = "/add/{num}/and/{numTwo}", method = RequestMethod.GET)
    @ResponseBody
    public long add(@PathVariable Long num, @PathVariable Long numTwo){
        return num + numTwo;
    }

    @RequestMapping(path = "/subtract/{num}/and/{numTwo}", method = RequestMethod.GET)
    @ResponseBody
    public long subtract(@PathVariable Long num, @PathVariable Long numTwo){
        return num - numTwo;
    }

    @RequestMapping(path = "/multiply/{num}/and/{numTwo}", method = RequestMethod.GET)
    @ResponseBody
    public long multiply(@PathVariable Long num, @PathVariable Long numTwo){
        return num * numTwo;
    }

    @RequestMapping(path = "/divide/{num}/and/{numTwo}", method = RequestMethod.GET)
    @ResponseBody
    public long divide(@PathVariable Long num, @PathVariable Long numTwo){
        return numTwo / num;
    }
}
