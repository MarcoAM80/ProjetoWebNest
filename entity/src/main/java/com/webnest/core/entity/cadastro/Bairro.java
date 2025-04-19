package com.webnest.core.entity.cadastro;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.SEQUENCE;

import java.util.UUID;

import com.webnest.core.entity.AbstractEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Version;
import jakarta.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter @Getter
@EqualsAndHashCode(of = "id", callSuper = false)
public class Bairro implements AbstractEntity{

	@Id
	@GeneratedValue(strategy = SEQUENCE)
	private Long id;
	
	@Version
	private int versao;
	
	@Column(nullable = false)
	private UUID uuid;
	
	@NotBlank
	@Column(length = 100)
	private String nome;
	
	@ManyToOne(fetch = LAZY)
	@JoinColumn(nullable = false)
	private Cidade cidade;

	@Override
	public String toString() {
		return nome;
	}
	
}
