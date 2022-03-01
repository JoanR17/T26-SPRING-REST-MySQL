package T26.GrandesAlmacenes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import T26.GrandesAlmacenes.dto.Venta;

public interface IVentaDAO extends JpaRepository<Venta, Integer>{

}
