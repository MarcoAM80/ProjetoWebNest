package com.webnest.api.controller;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.webnest.core.entity.AbstractEntity;
import com.webnest.core.service.CrudService;
public abstract class CrudController<E extends AbstractEntity, S extends CrudService<E, ? extends JpaRepository<E,Long>> > {

	private S service;

	public CrudController(S service) {
		this.service = service;
	}

	@PostMapping
	@Transactional
	public Long create(@RequestBody E entity) {
		return service.create(entity);
	}
	
	@PutMapping
	public void update(@RequestBody E entity) {
		service.update(entity);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		service.delete(id);
	}

    @GetMapping("/{id}")
	public E findById(@PathVariable("id") Long id) {
		return service.findById(id);
	}
    
    @GetMapping("/uuid/{id}")
	public E findByUuid(@PathVariable("id") UUID uuid) {
		return service.findByUuid(uuid);
	}

}
