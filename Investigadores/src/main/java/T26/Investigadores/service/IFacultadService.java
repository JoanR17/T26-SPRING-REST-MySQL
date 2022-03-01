package T26.Investigadores.service;

import java.util.List;

import T26.Investigadores.dto.Facultad;

public interface IFacultadService {

	public List<Facultad> listarFacultads(); 
	
	public Facultad guardarFacultad(Facultad Facultad);	
	
	public Facultad FacultadXID(int id);
	
	public Facultad actualizarFacultad(Facultad Facultad); 
	
	public void eliminarFacultad(int id);
	
}
