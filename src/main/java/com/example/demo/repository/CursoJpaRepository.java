package com.example.demo.repository;

import com.example.demo.entity.curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("cursoJpaRepository")
public interface CursoJpaRepository extends JpaRepository<curso, Serializable> {



}
