package com.example.demo.impl;

import com.example.demo.controller.cotroladorCursos;
import com.example.demo.entity.curso;
import com.example.demo.repository.CursoJpaRepository;
import com.example.demo.service.CursoServicio;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("cursoServicioImplementacion")
public class CursoServicioImplementacion implements CursoServicio {

    private static final Log LOG =  LogFactory.getLog(CursoServicioImplementacion.class);

    @Autowired
    @Qualifier("cursoJpaRepository")
    private CursoJpaRepository cursojparepository;


    @Override
    public List<curso> listAllCursos() {
        LOG.info("LLamado: " + "listAllCursos()");
        return cursojparepository.findAll();
    }

    @Override
    public curso addCurso(curso curso) {
        LOG.info("LLamado: " + "addCurso");
        return cursojparepository.save(curso);
    }

    @Override
    public void removeCurso(int id) {
         cursojparepository.deleteById(id);
    }

    @Override
    public curso updatedCurso(curso curso) {
        return cursojparepository.save(curso);
    }
}
