package securito.interfaz;

/**
 * @author Nice
 */

import java.util.List;

import securito.model.CapacitacionAgendadaModel;
import securito.model.CapacitacionModel;

/**

 * @author Nice

 */
public interface CapacitacionInterfaz {

	public interface CapacitacionIDao {
		//public List<Profesional> buscarDatosProfesional();
		//public List<Empresa> buscarDatosEmpresa();
		public List<CapacitacionModel> buscarDatosCapacitacion();
		public boolean IngresarCapacitacion(CapacitacionAgendadaModel user);
		public int autoIncremental();

	}

	// tuve que poner esto ya que no me reconoce los métodos al estar dentro del constructor
	boolean IngresarCapacitacion(CapacitacionAgendadaModel user);
	//lo mismo
	List<CapacitacionModel> buscarDatosCapacitacion();

	
}