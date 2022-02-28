package T26.PiezasProveedores.dto;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 * @author JOAN
 *
 */
@Entity
@Table(name="proveedores")
public class Suministra {
	
	//Atributos proveedores
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	@ManyToOne
    @JoinColumn(name="CodigoPieza")
    private Piezas pieza;

	@ManyToOne
    @JoinColumn(name="IdProveedor")
    private Proveedores proveedor;

	@Column(name="Precio")
	private int precio;

	public Suministra() {
	}

	public Suministra(String id, Piezas pieza, Proveedores proveedor, int precio) {
		this.id = id;
		this.pieza = pieza;
		this.proveedor = proveedor;
		this.precio = precio;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Piezas getPieza() {
		return pieza;
	}

	public void setPieza(Piezas pieza) {
		this.pieza = pieza;
	}

	public Proveedores getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedores proveedor) {
		this.proveedor = proveedor;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Suministra [id=" + id + ", pieza=" + pieza + ", proveedor=" + proveedor + ", precio=" + precio + "]";
	}
}
