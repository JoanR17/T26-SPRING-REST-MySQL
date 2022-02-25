package T26.PiezasProveedores.dto;

import java.util.List;

import javax.persistence.*;

/**
 * 
 * @author JOAN
 *
 */
@Entity
@Table(name="piezas")
public class Piezas {
	
	//Atributos piezas
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="Nombre")
	private String nombre;

	@OneToMany
	@JoinColumn(name = "Id")
	private List<Suministra> suministra;

	public Piezas() {
	}

	public Piezas(Long id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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
		return "Piezas [id=" + id + ", nombre=" + nombre + "]";
	}
}
