package T26.Investigadores.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import T26.Investigadores.dto.Reserva;

public interface IReservaDAO extends JpaRepository<Reserva, Integer>{

}
