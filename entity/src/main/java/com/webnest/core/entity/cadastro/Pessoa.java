package com.webnest.core.entity.cadastro;

import java.util.UUID;

import com.webnest.core.entity.AbstractEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Version;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter @Getter
@EqualsAndHashCode(of = "id", callSuper = false)
public abstract class Pessoa implements AbstractEntity {

	@Id
	private Long id;
	
	@Version
	private int versao;

	@Column(nullable = false)
	private UUID uuid;

	@Column(unique = true)
	private Long codigo;
	
	@Column(length = 100)
	private String nome;
	
	@Column(length = 14)
	private String cpfCnpj;

}
