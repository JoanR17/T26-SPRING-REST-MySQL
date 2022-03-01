package T26.GrandesAlmacenes.service;

import java.util.List;

import T26.GrandesAlmacenes.dto.Venta;

public interface IVentaService {

	public List<Venta> listarVentas();

	public Venta guardarVentas(Venta venta);

	public Venta VentasXID(int ID);

	public Venta actualizarVentas(Venta venta);

	public void eliminarVentas(int ID);
}