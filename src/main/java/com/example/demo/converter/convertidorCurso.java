package com.example.demo.converter;

import com.example.demo.entity.curso;
import com.example.demo.model.cursoModelo;

public class convertidorCurso {

    private cursoModelo cursmodel;

    //entity --> model
    public cursoModelo entity2Model(curso curso){
    cursoModelo cursmodel = new cursoModelo();
    cursmodel.setNombre(curso.getNombre());
    cursmodel.setDescripcion(curso.getDescripcion());
    cursmodel.setPrecio(curso.getPrecio());
    cursmodel.setHora(curso.getHora());

    return cursmodel;
    }

    //model --> entity
    public curso entity2Model(cursoModelo cursomodel){
        curso curso = new curso();
        curso.setNombre(cursomodel.getNombre());
        curso.setDescripcion(cursomodel.getDescripcion());
        curso.setPrecio(cursomodel.getPrecio());
        curso.setHora(cursomodel.getHora());

        return curso;
    }
}
