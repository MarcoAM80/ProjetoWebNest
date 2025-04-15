package com.webnest.core.entity.cadastro;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.SEQUENCE;

import java.util.Objects;
import java.util.UUID;

import com.webnest.core.entity.AbstractEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name = "bairro")
public class Bairro implements AbstractEntity{

	@Id
	@GeneratedValue(strategy = SEQUENCE)
	private Long id;
	
	@Version
	private int versao;
	
	private UUID uuid;
	
	private String nome;
	
	@ManyToOne(fetch = LAZY)
	private Cidade cidade;

	@Override
	public Long getId() {
		return id;
	}
	
	@Override
	public void setId(Long id) {
		this.id = id;
	}
	
	@Override
	public int getVersao() {
		return versao;
	}

	@Override
	public void setVersao(int versao) {
		this.versao = versao;
	}

	@Override
	public UUID getUuid() {
		return uuid;
	}

	@Override
	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Bairro other = (Bairro) obj;
		return Objects.equals(id, other.id);
	}
	
	@Override
	public String toString() {
		return nome;
	}
	
}
