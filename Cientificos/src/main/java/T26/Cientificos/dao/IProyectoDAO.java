package T26.Cientificos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import T26.Cientificos.dto.Proyecto;

public interface IProyectoDAO extends JpaRepository<Proyecto, Integer>{

}
