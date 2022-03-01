package T26.Cientificos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import T26.Cientificos.dto.Cientificos;

public interface ICientificosDAO extends JpaRepository<Cientificos, Integer>{

}
