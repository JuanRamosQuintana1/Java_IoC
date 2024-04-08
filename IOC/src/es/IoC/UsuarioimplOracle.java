package es.IoC;

public class UsuarioimplOracle implements IUsuario{

	@Override
	public void insertarUsuario() {
		// TODO Auto-generated method stub
		System.out.println("Insertando usuario con Oracle");
	}

	@Override
	public void eliminarUsuarioById(int id) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando usuario con Oracle: " + id);
		
	}

}
