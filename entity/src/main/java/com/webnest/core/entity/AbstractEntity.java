package com.webnest.core.entity;

import java.util.UUID;

public interface AbstractEntity {
	
	Long getId();
	void setId(Long id);
	
	UUID getUuid();
	void setUuid(UUID uuid);
	
	int getVersao();
	void setVersao(int versao);

}
