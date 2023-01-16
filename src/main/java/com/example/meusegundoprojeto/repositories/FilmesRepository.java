package com.example.meusegundoprojeto.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.meusegundoprojeto.entidades.Filmes;

@Repository
public interface FilmesRepository extends JpaRepository<Filmes, Long>  {


}
