package com.webnest.core.entity.cadastro;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.SEQUENCE;

import java.util.List;
import java.util.UUID;

import com.webnest.core.entity.AbstractEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Version;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Setter @Getter
@EqualsAndHashCode(of = "id", callSuper = false)
@Entity
public class Estado implements AbstractEntity {
	
	@Id
	@GeneratedValue(strategy = SEQUENCE)
	private Long id;
	
	@Version
	private int versao;
	
	@Column(unique = true)
	private UUID uuid;

	@Size(max = 2 , min = 2)
	@Column(length = 2, unique = true)
	private String uf;

	@NotBlank
	@Column(length = 20)
	private String nome;
	
	@Positive
	private int codigoIbge;
	
	@OneToMany(mappedBy = "estado", fetch = LAZY)
	private List<Cidade> cidades;
	
	@Override
	public String toString() {
		return uf;
	}

}
