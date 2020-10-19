package com.example.demo.controller.example3_form;

import com.example.demo.model.person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("example3_form")

public class form {

    private static final String form ="example3_form/form";
    private static final String showDatos ="example3_form/showDatos";

    /*Ejemplo de redireccion*/
    /*Ejemplo 1
    @GetMapping("/")
    public String redirect(){
        return "redirect:/example3_form/showForm";
    }*/

    /*Ejemplo 2*/
    @GetMapping("/")
public RedirectView redirect(){
        return new RedirectView("/example3_form/showForm");
    }
    @GetMapping("/showForm")
    public String showForm(Model model){
        model.addAttribute("persona",new person());
        return form;
    }

    @PostMapping("/addPersona")
    public ModelAndView addForm(@ModelAttribute("persona") person persona){
        ModelAndView mov = new ModelAndView(showDatos);
        mov.addObject("persona",persona);
        return mov;
    }

}
