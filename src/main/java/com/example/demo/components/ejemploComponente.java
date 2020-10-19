package com.example.demo.components;

import com.example.demo.repository.CursoJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ejemploComponente")
public class ejemploComponente {

    @Autowired
    @Qualifier("cursoJpaRepository")
    private CursoJpaRepository cursoRepository;
    public void sayHello(){

        System.out.println("Desde componente");
    }
}
