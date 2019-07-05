package com.pokedex.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "pokemonskills")
public class PokemonSkillEntity {

	@Id
	@Column(name = "posid")
	private Integer pokemonSkillId;

//	@Column(name = "pokid")
//	private Integer pokemonId;

	@Column(name = "skiid")
	private Integer skillId;

	@Column(name = "pospower")
	private Integer pospower;

	@ManyToOne
	@JoinColumn(name = "pokid")
	private PokemonEntity pokemon;

	/**
	 * @return the skillId
	 */
	public Integer getSkillId() {
		return skillId;
	}

	/**
	 * @param skillId the skillId to set
	 */
	public void setSkillId(Integer skillId) {
		this.skillId = skillId;
	}

	/**
	 * @return the pokemonSkillId
	 */
	public Integer getPokemonSkillId() {
		return pokemonSkillId;
	}

	/**
	 * @param pokemonSkillId the pokemonSkillId to set
	 */
	public void setPokemonSkillId(Integer pokemonSkillId) {
		this.pokemonSkillId = pokemonSkillId;
	}

	/**
	 * @return the pospower
	 */
	public Integer getPospower() {
		return pospower;
	}

	/**
	 * @param pospower the pospower to set
	 */
	public void setPospower(Integer pospower) {
		this.pospower = pospower;
	}

	/**
	 * @return the pokemon
	 */
	public PokemonEntity getPokemon() {
		return pokemon;
	}

	/**
	 * @param pokemon the pokemon to set
	 */
	public void setPokemon(PokemonEntity pokemon) {
		this.pokemon = pokemon;
	}

}
