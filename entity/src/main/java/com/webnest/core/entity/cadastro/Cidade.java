package com.webnest.core.entity.cadastro;

import static jakarta.persistence.FetchType.LAZY;

import java.util.List;
import java.util.UUID;

import com.webnest.core.entity.AbstractEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Version;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter @Getter
@EqualsAndHashCode(of = "id", callSuper = false)
public class Cidade implements AbstractEntity {

	@Id
	private Long id;
	
	@Version
	private int versao;

	@Column(nullable = false)
	private UUID uuid;

	@Positive
	private int codigoIbge;
	
	@NotBlank
	@Column(length = 100)
	private String nome;
	
	@ManyToOne(fetch = LAZY)
	@JoinColumn(nullable = false)
	private Estado estado;
	
	@OneToMany(mappedBy = "cidade", fetch = LAZY)
	private List<Bairro> bairros;
	
	@Override
	public String toString() {
		return nome;
	}
	
}
