package com.testcursojava.testpring.model.daos;

import com.testcursojava.testpring.model.entities.Usuario;

public interface IUserDAO {
	public Usuario login(String u,String p);
}
