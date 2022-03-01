package T26.GrandesAlmacenes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import T26.GrandesAlmacenes.dto.Productos;

public interface IProductosDAO extends JpaRepository<Productos, Integer>{

}
