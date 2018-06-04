package usjt.olimpiada.service;

import usjt.olimpiada.dao.UsuarioDAO;
import usjt.olimpiada.model.Usuario;


public class UsuarioService {

	UsuarioDAO uDAO = new UsuarioDAO();
	
	public boolean validaUsuario(Usuario usuario) {
		return uDAO.validaUsuario(usuario);
	}
}
