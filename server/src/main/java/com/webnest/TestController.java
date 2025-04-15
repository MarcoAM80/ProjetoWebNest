package com.webnest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webnest.commons.util.DateTimeUtils;
import com.webnest.core.entity.cadastro.Cidade;
import com.webnest.core.entity.cadastro.Estado;

@RestController
public class TestController {
	
	  @GetMapping("/toctoc")
	  public String tocToc() {
	      return "Seja vem vindo!<br>" + DateTimeUtils.toString(LocalDateTime.now(), "dd/MM/yyy HH:mm:ss");
	  }
	  
	  @GetMapping("/jsontest")
	  public Cidade jsonTest() {
		  Estado estado = new Estado();
		  estado.setCodigoIbge(25);
		  estado.setNome("Santa Catarina");
		  estado.setUf("SC");
		  
		  Cidade cidade = new Cidade();
		  cidade.setCodigoIbge(3455);
		  cidade.setNome("Brusque");
		  cidade.setEstado(estado);
		  
	      return cidade;
	  }

	  
	  
}
