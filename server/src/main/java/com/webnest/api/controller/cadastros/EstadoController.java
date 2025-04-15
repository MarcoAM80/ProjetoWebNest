package com.webnest.api.controller.cadastros;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webnest.api.controller.CrudController;
import com.webnest.core.entity.cadastro.Estado;
import com.webnest.core.service.cadastro.EstadoService;

@RestController
@RequestMapping("/estados")
public class EstadoController extends CrudController<Estado, EstadoService>{

	protected EstadoController(EstadoService service) {
		super(service);
	}

}
