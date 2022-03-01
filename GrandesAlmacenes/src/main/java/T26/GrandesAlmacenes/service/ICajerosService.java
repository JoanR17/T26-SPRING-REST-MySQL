package T26.GrandesAlmacenes.service;

import java.util.List;

import T26.GrandesAlmacenes.dto.Cajeros;

public interface ICajerosService {

	public List<Cajeros> listarCajeros();

	public Cajeros guardarCajeros(Cajeros Cajeros);

	public Cajeros CajerosXID(int ID);

	public Cajeros actualizarCajeros(Cajeros Cajeros);

	public void eliminarCajeros(int ID);
}