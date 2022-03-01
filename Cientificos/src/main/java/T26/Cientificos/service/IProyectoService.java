package T26.Cientificos.service;

import java.util.List;

import T26.Cientificos.dto.Proyecto;

public interface IProyectoService {
	
	public List<Proyecto> listarProyecto();
	
	public Proyecto guardarProyecto(Proyecto proyecto);
	
	public Proyecto proyectoXID(int id);
	
	public Proyecto actualizarProyecto(Proyecto proyecto);
	
	public void eliminarProyecto(int id);
}
