package es.IoC;

public class App {
	
	public static void main(String[] args) {
		UsuarioFactory obj = new UsuarioFactory(new UsuarioimplOracle());
		obj.getInsertarUsuario();
		obj.getEliminarUsuarioById(1);
	}

}
