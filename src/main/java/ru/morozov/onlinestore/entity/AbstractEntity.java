package ru.morozov.onlinestore.entity;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.UUID;

@MappedSuperclass
public class AbstractEntity implements Serializable {
	@Id
	private String id = UUID.randomUUID().toString();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
