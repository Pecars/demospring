package securito.interfaz;

/**
 * @author Paula Carrasco
 */

import java.util.List;

import securito.model.ClientesModel;


public interface ClientesInterfaz {

	public boolean crearCliente(ClientesModel cliente);
	public List<ClientesModel> leerCliente();
	public boolean actualizarUsuario(ClientesModel cliente);
	public boolean eliminarCliente(ClientesModel cliente);
	public ClientesModel obtenerCliente(int rutEmpresa);
	
}
