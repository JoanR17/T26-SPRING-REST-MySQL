package T26.GrandesAlmacenes.service;

import java.util.List;

import T26.GrandesAlmacenes.dto.Maquinas_Registradoras;

public interface IMaquinas_RegistradorasService {

	public List<Maquinas_Registradoras> listarMaquinas_Registradoras();

	public Maquinas_Registradoras guardarMaquinas_Registradoras(Maquinas_Registradoras Maquinas_Registradoras);

	public Maquinas_Registradoras Maquinas_RegistradorasXID(int ID);

	public Maquinas_Registradoras actualizarMaquinas_Registradoras(Maquinas_Registradoras Maquinas_Registradoras);

	public void eliminarMaquinas_Registradoras(int ID);
}
