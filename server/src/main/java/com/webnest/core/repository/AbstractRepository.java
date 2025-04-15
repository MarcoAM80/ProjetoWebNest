package com.webnest.core.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;

import com.webnest.core.entity.AbstractEntity;

@NoRepositoryBean
public interface AbstractRepository<E extends AbstractEntity> extends JpaRepository<E, Long>{
	
	E findByUuid(UUID uuid);
	
	@Query("SELECT e.id FROM #{#entityName} e WHERE e.uuid = :uuid")
	Long getIdByUuid(@Param("uuid") UUID id);

}
