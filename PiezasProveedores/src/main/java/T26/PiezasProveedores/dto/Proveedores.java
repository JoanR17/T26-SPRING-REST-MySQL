package T26.PiezasProveedores.dto;

import java.util.List;

import javax.persistence.*;

/**
 * 
 * @author JOAN
 *
 */
@Entity
@Table(name="proveedores")
public class Proveedores {
	
	//Atributos proveedores
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	@Column(name="Nombre")
	private String nombre;

	@OneToMany
	@JoinColumn(name = "Id")
	private List<Suministra> suministra;

	public Proveedores() {
	}

	public Proveedores(String id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Proveedores [id=" + id + ", nombre=" + nombre + "]";
	}
}
