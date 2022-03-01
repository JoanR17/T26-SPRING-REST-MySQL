package T26.GrandesAlmacenes.service;

import java.util.List;

import T26.GrandesAlmacenes.dto.Productos;

public interface IProductosService {

	public List<Productos> listarProductos();

	public Productos guardarProductos(Productos Productos);

	public Productos ProductosXID(int ID);

	public Productos actualizarProductos(Productos Productos);

	public void eliminarProductos(int ID);
}
