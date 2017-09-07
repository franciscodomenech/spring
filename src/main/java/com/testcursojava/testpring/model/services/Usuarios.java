package com.testcursojava.testpring.model.services;

import com.testcursojava.testpring.model.daos.UserDAO;
import com.testcursojava.testpring.model.entities.Usuario;

public class Usuarios {
	public static Usuario login(String u,String p) {
		return new UserDAO().login(u, p);
	}
}
