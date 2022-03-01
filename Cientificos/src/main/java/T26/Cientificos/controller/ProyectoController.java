package T26.Cientificos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import T26.Cientificos.dto.Proyecto;
import T26.Cientificos.service.ProyectoServiceIMPL;

@RestController
@RequestMapping("/api")
public class ProyectoController {
	@Autowired
	ProyectoServiceIMPL proyectoServiceIMPL;
	
	@GetMapping("/proyecto")
	public List<Proyecto> listarProyecto(){
		return proyectoServiceIMPL.listarProyecto();
	}
	
	@PostMapping("/proyecto")
	public Proyecto guardProyecto(@RequestBody Proyecto proyecto) {
		return proyectoServiceIMPL.guardarProyecto(proyecto);
	}
	
	@GetMapping("/proyecto/{id}")
	public Proyecto protectoXID(@PathVariable(name="id") int id) {
		Proyecto xid = new Proyecto();
		
		xid=proyectoServiceIMPL.proyectoXID(id);
		
		System.out.println("Proyecto: " + xid);
		
		return xid;
	}
	
	@PutMapping("/proyecto/{id}")
	public Proyecto actualizarProyecto(@PathVariable(name="id")int id,@RequestBody Proyecto proyecto) {
		Proyecto sel = new Proyecto();
		Proyecto act = new Proyecto();
		
		sel = proyectoServiceIMPL.proyectoXID(id);
		sel.setNombre(proyecto.getNombre());
		sel.setHoras(proyecto.getHoras());
		
		act = proyectoServiceIMPL.actualizarProyecto(sel);
		
		System.out.println("Proyecto actualizado: " + act);
		return act;
	}
	
	@DeleteMapping("/proyecto/{id}")
	public void eliminarProyecto(@PathVariable(name="id")int id) {
		proyectoServiceIMPL.eliminarProyecto(id);
	}
}
