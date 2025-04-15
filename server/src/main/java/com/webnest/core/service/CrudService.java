package com.webnest.core.service;

import java.util.UUID;

import org.springframework.dao.DataIntegrityViolationException;

import com.webnest.core.entity.AbstractEntity;
import com.webnest.core.repository.AbstractRepository;

public abstract class CrudService<E extends AbstractEntity, R extends AbstractRepository<E>> {

	private R repo;

	protected CrudService(R repo) {
		this.repo = repo;
	}
	
	public Long create(E entity) {
		try {
			entity.setId(null);
			E createdEntity = repo.save(entity);
			repo.flush();
			return createdEntity.getId();
		} catch (DataIntegrityViolationException e) {
			Long id = repo.getIdByUuid(entity.getUuid());
			if (id == null ) {
				throw e;
			}
			return id;
		}
	}
	
	public void update(E entity) {
		repo.save(entity);
	}
	
	public void delete(Long id) {
		repo.deleteById(id);
	}

	public E findById(Long id) {
		return repo.findById(id).orElse(null);
	}
	
	public E findByUuid(UUID uuid) {
		return repo.findByUuid(uuid);
	}

}
