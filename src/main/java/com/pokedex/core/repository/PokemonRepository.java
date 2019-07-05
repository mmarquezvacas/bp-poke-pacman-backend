package com.pokedex.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokedex.core.entity.PokemonEntity;

public interface PokemonRepository extends JpaRepository<PokemonEntity, Integer> {

}
