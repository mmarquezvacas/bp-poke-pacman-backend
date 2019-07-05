package com.pokedex.core.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pokedex.core.entity.PokemonEntity;

public interface PokemonRepository extends JpaRepository<PokemonEntity, Integer> {

	@Modifying
	@Query(value = "update pokemon p set p.state = :pokState where id = :pokid")
	void changePokemonStatus(@Param("pokid") Integer pokid, @Param("pokState") String pokState);

	@Query(value = "from pokemon p where p.state = :pokState")
	List<PokemonEntity> findByState(@Param("pokState") String pokState);

}
