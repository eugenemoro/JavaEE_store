package ru.morozov.onlinestore.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class AbstractDAO {

	@PersistenceContext(unitName = "morozov-persistence-unit")
	protected EntityManager em;
}
