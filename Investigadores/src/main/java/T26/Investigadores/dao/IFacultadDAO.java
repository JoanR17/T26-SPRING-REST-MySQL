package T26.Investigadores.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import T26.Investigadores.dto.Facultad;

public interface IFacultadDAO extends JpaRepository<Facultad, Integer>{

}
