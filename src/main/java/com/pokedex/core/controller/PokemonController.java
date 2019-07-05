package com.pokedex.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pokedex.core.entity.PokemonEntity;
import com.pokedex.core.service.PokemonService;

@RestController
@RequestMapping("/pokemon")
@Lazy
public class PokemonController {

	@Autowired
	public PokemonService pokemonService;

	@GetMapping("/listByState")
	public List<PokemonEntity> listByState() {
		return this.pokemonService.list();
	}

	@PostMapping("/changePokemonStatus")
	public void changePokemonStatus(@RequestParam Integer pokid) {
		this.pokemonService.changePokemonStatus(pokid, "A");
	}

//	@GetMapping("/skillById")
//	public List<PokemonEntity> listByState() {
//		return this.pokemonService.list();
//	}

}
