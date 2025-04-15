package com.webnest.core.entity.cadastro;

import static jakarta.persistence.FetchType.LAZY;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

import com.webnest.core.entity.AbstractEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Version;

@Entity
public class Cidade implements AbstractEntity {

	@Id
	private Long id;
	
	@Version
	private int versao;
	
	private UUID uuid;
	private UUID chaveIdemPotente;
	
	private int codigoIbge;
	private String nome;
	
	@ManyToOne(fetch = LAZY)
	private Estado estado;
	
	@OneToMany(mappedBy = "cidade", fetch = LAZY)
	private List<Bairro> bairros;
	
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
	
	public int getCodigoIbge() {
		return codigoIbge;
	}
	
	public void setCodigoIbge(int codigoIbge) {
		this.codigoIbge = codigoIbge;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
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
		Cidade other = (Cidade) obj;
		return Objects.equals(id, other.id);
	}
	
	@Override
	public String toString() {
		return nome;
	}
	
}
