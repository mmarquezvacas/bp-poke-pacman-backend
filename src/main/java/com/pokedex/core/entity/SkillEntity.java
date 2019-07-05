package com.pokedex.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "pokemonskills")
public class SkillEntity {

	@Id
	@Column(name = "skiid")
	private Integer pokemonSkillId;

	@Column(name = "skiname")
	private String skillName;

	@Column(name = "skitype")
	private String skillType;

	@Column(name = "skidescription")
	private String skillDescription;

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
	 * @return the skillName
	 */
	public String getSkillName() {
		return skillName;
	}

	/**
	 * @param skillName the skillName to set
	 */
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	/**
	 * @return the skillType
	 */
	public String getSkillType() {
		return skillType;
	}

	/**
	 * @param skillType the skillType to set
	 */
	public void setSkillType(String skillType) {
		this.skillType = skillType;
	}

	/**
	 * @return the skillDescription
	 */
	public String getSkillDescription() {
		return skillDescription;
	}

	/**
	 * @param skillDescription the skillDescription to set
	 */
	public void setSkillDescription(String skillDescription) {
		this.skillDescription = skillDescription;
	}

}
