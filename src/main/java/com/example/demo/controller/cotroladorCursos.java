package com.example.demo.controller;

import com.example.demo.entity.curso;
import com.example.demo.impl.CursoServicioImplementacion;
import com.example.demo.service.CursoServicio;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/cursos")
public class cotroladorCursos {

    private static final String VISTA_CURSOS ="cursosVista";

    private static final Log LOG =  LogFactory.getLog(cotroladorCursos.class);
    @Autowired
    @Qualifier("cursoServicioImplementacion")
    private CursoServicio cursoServ;

    @GetMapping("/listarcursos")
    public ModelAndView listarCursos(){
        LOG.info("LLamado" + " listarCursos()");
         ModelAndView mov = new ModelAndView(VISTA_CURSOS);
         mov.addObject("curso", new curso());
        mov.addObject("listarCursos",cursoServ.listAllCursos());

        return mov;
    }
@PostMapping("/addcurso")
    public String addCurso(@ModelAttribute("curso") curso curso){
    LOG.info("LLamado" + "addCurso" + "Parametros" + curso.toString());
        cursoServ.addCurso(curso);
        return "redirect:/cursos/listarcursos";
    }
}
