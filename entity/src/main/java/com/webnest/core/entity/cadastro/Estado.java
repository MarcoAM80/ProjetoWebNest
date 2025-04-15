package com.webnest.core.entity.cadastro;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.SEQUENCE;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

import com.webnest.core.entity.AbstractEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Version;

@Entity
public class Estado implements AbstractEntity {
	
	@Id
	@GeneratedValue(strategy = SEQUENCE)
	private Long id;
	
	@Version
	private int versao;
	
	@Column(unique = true)
	private UUID uuid;
	
	private String uf;
	private String nome;
	private int codigoIbge;
	
	@OneToMany(mappedBy = "estado", fetch = LAZY)
	private List<Cidade> cidades;
	
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
	
	public String getUf() {
		return uf;
	}
	
	public void setUf(String uf) {
		this.uf = uf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCodigoIbge() {
		return codigoIbge;
	}
	
	public void setCodigoIbge(int codigoIbge) {
		this.codigoIbge = codigoIbge;
	}
	
	public List<Cidade> getCidades() {
		return cidades;
	}
	
	public void setCidades(List<Cidade> cidades) {
		this.cidades = cidades;
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
		Estado other = (Estado) obj;
		return Objects.equals(id, other.id);
	}
	
	@Override
	public String toString() {
		return uf;
	}

}
