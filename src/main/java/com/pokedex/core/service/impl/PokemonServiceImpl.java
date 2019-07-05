package com.pokedex.core.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokedex.core.entity.PokemonEntity;
import com.pokedex.core.repository.PokemonRepository;
import com.pokedex.core.service.PokemonService;

@Service
@Transactional
public class PokemonServiceImpl implements PokemonService {

	@Autowired
	public PokemonRepository pokemonRepository;

	/**
	 * Retorna la lista de ingredientes.
	 * 
	 * @return lista de ingredientes
	 */
	@Override
	public List<PokemonEntity> list() {

		return this.pokemonRepository.findAll();
	}

	@Override
	public void changePokemonStatus(Integer pokid, String pokState) {
		this.pokemonRepository.changePokemonStatus(pokid, pokState);
	}

	@Override
	public List<PokemonEntity> findByState(String pokState) {

		return this.pokemonRepository.findByState(pokState);
	}

}
