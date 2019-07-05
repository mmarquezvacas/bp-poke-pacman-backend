package com.pokedex.core.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

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
