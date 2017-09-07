package com.testcursojava.testpring.model.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.testcursojava.testpring.model.entities.Usuario;

public class UserDAO implements IUserDAO {
	@PersistenceContext	
	private EntityManager entityManager;
	@Override
	public Usuario login(String u, String p) {
		String hql = "FROM uses WHERE user = ? and pass = ? limit 1";
		return entityManager.createQuery(hql,Usuario.class).setParameter(1, u).setParameter(2, p).getSingleResult();
	}

}
