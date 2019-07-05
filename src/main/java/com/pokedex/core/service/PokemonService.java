package com.pokedex.core.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.pokedex.core.entity.PokemonEntity;

public interface PokemonService {

	List<PokemonEntity> list();

	void changePokemonStatus(@Param("pokid") Integer pokid, @Param("pokState") String pokState);
}
