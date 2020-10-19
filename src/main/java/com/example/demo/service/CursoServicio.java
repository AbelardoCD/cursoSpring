package com.example.demo.service;


import com.example.demo.entity.curso;

import java.util.List;

public interface CursoServicio {

    public abstract List<curso> listAllCursos();

    public abstract curso addCurso(curso curso);

        public abstract void removeCurso(int id);

    public abstract curso updatedCurso(curso curso);

}
