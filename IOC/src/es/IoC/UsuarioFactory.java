package es.IoC;

public class UsuarioFactory {
	
	IUsuario usr;
	
	public UsuarioFactory(IUsuario usr) {
		this.usr = usr;
	}

	public void getInsertarUsuario() {
		usr.insertarUsuario();
	}

	public void getEliminarUsuarioById(int id) {
		usr.eliminarUsuarioById(id);
	}
}
