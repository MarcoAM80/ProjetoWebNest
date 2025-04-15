package com.webnest.core.service.cadastro;

import org.springframework.stereotype.Service;

import com.webnest.core.entity.cadastro.Estado;
import com.webnest.core.repository.cadastro.EstadoRepo;
import com.webnest.core.service.CrudService;

@Service
public class EstadoService extends CrudService<Estado, EstadoRepo> {

	protected EstadoService(EstadoRepo repo) {
		super(repo);
	}

}
