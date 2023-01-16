package com.example.meusegundoprojeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.meusegundoprojeto.entidades.Filmes;

@Repository
public interface FilmesRepository extends JpaRepository<Filmes, Long>  {


}
