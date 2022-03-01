package T26.GrandesAlmacenes.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import T26.GrandesAlmacenes.dao.IProductosDAO;
import T26.GrandesAlmacenes.dto.Productos;

@Service
public class ProductosServiceIMPL implements IProductosService{

	@Autowired
	IProductosDAO iProductosDAO;
	@Override
	public List<Productos> listarProductos() {
		return iProductosDAO.findAll();
	}

	@Override
	public Productos guardarProductos(Productos Productos) {
		return iProductosDAO.save(Productos);
	}

	@Override
	public Productos ProductosXID(int Codigo) {
		return iProductosDAO.findById(Codigo).get();
	}

	@Override
	public Productos actualizarProductos(Productos Productos) {
		return iProductosDAO.save(Productos);
	}

	@Override
	public void eliminarProductos(int Codigo) {
		iProductosDAO.deleteById(Codigo);
	}

}
