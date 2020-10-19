package com.example.demo.repository;

import com.example.demo.entity.Qcurso;
import com.example.demo.entity.curso;
import com.querydsl.jpa.impl.JPAQuery;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository("queryDSLExampleRepo")
public class QueryDSLExampleRepo {

    private Qcurso qCurso = Qcurso.curso;

    @PersistenceContext
    private EntityManager em;
    public void find(){
        JPAQuery<curso> query =new JPAQuery<curso>(em);
        curso cursoq =query.select(qCurso).from(qCurso).where(qCurso.id.eq(1)).fetchOne();

        List<curso> listaCurso =query.select(qCurso).from(qCurso).where(qCurso.hora.between(5,6)).fetch();

    }
}
