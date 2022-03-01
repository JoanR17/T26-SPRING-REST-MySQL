package T26.Investigadores.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import T26.Investigadores.dto.Investigadores;

public interface IInvestigadoresDAO extends JpaRepository<Investigadores, Integer>{

}
