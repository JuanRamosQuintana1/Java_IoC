package es.IoC;

public class UsuarioimplMongo implements IUsuario{

	@Override
	public void insertarUsuario() {
		// TODO Auto-generated method stub
		System.out.println("Insertando usuario con Mongo");
		
	}

	@Override
	public void eliminarUsuarioById(int id) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando usuario con Mongo: " + id);
		
	}

}
