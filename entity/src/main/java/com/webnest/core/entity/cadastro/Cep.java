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
import jakarta.persistence.Version;

@Entity
public class Cep implements AbstractEntity{
	
	@Id
	@GeneratedValue(strategy = SEQUENCE)
	private Long id;
	
	@Version
	private int versao;
	
	private UUID uuid;
	
	private String codigo;
	private String logradouro;
	
	@ManyToOne(fetch = LAZY)
	private Bairro bairro;
	
	@ManyToOne(fetch = LAZY)
	private Cidade cidade;
	
	@ManyToOne(fetch = LAZY)
	private Estado estado;
	
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
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public String getLogradouro() {
		return logradouro;
	}
	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
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
		Cep other = (Cep) obj;
		return Objects.equals(id, other.id);
	}
	
	@Override
	public String toString() {
		return String.join("", codigo, "-", logradouro);
	}

}
