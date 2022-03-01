package T26.Investigadores.service;

import java.util.List;

import T26.Investigadores.dto.Equipos;

public interface IEquiposService {

	public List<Equipos> listarEquipos(); 
	
	public Equipos guardarEquipos(Equipos Equipos);	
	
	public Equipos EquiposXID(int id);
	
	public Equipos actualizarEquipos(Equipos Equipos); 
	
	public void eliminarEquipos(int id);
	
}
