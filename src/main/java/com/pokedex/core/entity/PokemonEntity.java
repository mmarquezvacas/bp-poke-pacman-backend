package com.pokedex.core.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name = "pokemon")
public class PokemonEntity {

	@Id
	@Column(name = "pokid")
	private Integer id;

	@Column(name = "pokhp")
	public Integer hp;

	@Column(name = "pokimageurl")
	public String imageurl;

	@Column(name = "pokname")
	public String name;

	@Column(name = "pokdescription")
	public String description;

	@Column(name = "poklevel")
	public Integer level;

	@Column(name = "pokstate")
	public String state;
	
	@Column(name = "poktipo")
	public String type;



	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pokemon")
	private List<PokemonSkillEntity> pokemonSkillEntitys;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getHp() {
		return hp;
	}

	public void setHp(Integer hp) {
		this.hp = hp;
	}

	public String getImageurl() {
		return imageurl;
	}

	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
