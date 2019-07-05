package com.pokedex.core.repository.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

@Repository
public class PokemonRepositoryImpl extends QuerydslRepositorySupport {

	@Autowired
	@Lazy
	private SessionFactory sessionFactory;

	public PokemonRepositoryImpl(Class<?> domainClass) {
		super(domainClass);
	}

}
