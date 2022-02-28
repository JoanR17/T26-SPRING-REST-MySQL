package T26.PiezasProveedores.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import T26.PiezasProveedores.dao.ISuministraDAO;
import T26.PiezasProveedores.dto.*;

@Service
public class SuministraServiceImpl implements ISuministraService {

	@Autowired
	ISuministraDAO iSuministraDAO;
	
	@Override
	public List<Suministra> listarSuministra() 
	{
		return iSuministraDAO.findAll();
	}

	@Override
	public Suministra guardarSuministra(Suministra suministra) 
	{
		return iSuministraDAO.save(suministra);
	}

	@Override
	public Suministra suministraXID(Long id) 
	{
		return iSuministraDAO.findById(id).get();
	}

	@Override
	public Suministra actualizarSuministra(Suministra suministra) 
	{
		return iSuministraDAO.save(suministra);
	}

	@Override
	public void eliminarSuministra(Long id) 
	{
		iSuministraDAO.deleteById(id);
	}

}
