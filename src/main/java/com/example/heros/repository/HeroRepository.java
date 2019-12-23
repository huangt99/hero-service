package com.example.heros.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.heros.domain.Hero;


public interface HeroRepository extends CrudRepository<Hero, Long> {
	@RestResource(path = "name", rel = "name")
	@Query("from Hero h where lower(h.name) like CONCAT('%', lower(:contains), '%')")
	public Iterable<Hero> findByName(@Param("contains") String name);
}