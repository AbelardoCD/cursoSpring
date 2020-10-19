package com.example.demo.controller;

import com.example.demo.components.ejemploComponente;
import com.example.demo.model.person;
import com.example.demo.service.exampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/say")
public class helloWorldController {
    public static final String  modeloARetornar = "helloWorld";
    @Autowired
    @Qualifier("exampleService")
    private exampleService exampleServ;
    @Autowired
    @Qualifier("ejemploComponente")
    private ejemploComponente ej;

    //primera forma
    @GetMapping("/hello")
    public String helloWorld(Model model){
        ej.sayHello();
        model.addAttribute("persona", exampleServ.getListPeople());
        return modeloARetornar;
    }

    //segunda forma
    @GetMapping("/helloMAV")
    public ModelAndView modelAndView(){
        ModelAndView mod = new ModelAndView(modeloARetornar);
        mod.addObject("persona",exampleServ.getListPeople());
        return mod;
    }

    /*public List<person> getPeople(){
        List<person> person = new ArrayList<>();
        person.add(new person("Abe",23));
        person.add(new person("Liam",3));
        person.add(new person("Mia",2));
        person.add(new person("Aldo",20));

        return person;
    }*/
}
