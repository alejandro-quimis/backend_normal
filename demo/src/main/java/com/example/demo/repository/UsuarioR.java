package com.example.demo.repository;

import com.example.demo.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UsuarioR extends JpaRepository<Usuario,Integer> {
    @Override
    @Query("select t from #{#entityName} t where t.estado='a'")
    List<Usuario> findAll();



}
