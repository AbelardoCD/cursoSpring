package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example2")
public class example2 {

    private static final String example2_View="example2";

    //primera forma
    @GetMapping("/request1")
    public ModelAndView request1(@RequestParam(name="nm", required = false,defaultValue = "World") String nombre){
        ModelAndView mov = new ModelAndView(example2_View);
        mov.addObject("nombreGet",nombre);
        return mov;
    }

    //segunda forma
    @GetMapping("/request2/{nm}")
    public ModelAndView request2(@PathVariable(value = "nm") String nombre){
        ModelAndView mov = new ModelAndView(example2_View);
        mov.addObject("nombreGet",nombre);
        return mov;
    }
}
