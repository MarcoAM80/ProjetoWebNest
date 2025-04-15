package com.webnest.core.entity.cadastro;

import com.webnest.core.entity.AbstractEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public abstract class Pessoa implements AbstractEntity {

	@Id
	private Long id;
	private Long codigo;
	private String nome;
	private String cpfCnpj;

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

}
