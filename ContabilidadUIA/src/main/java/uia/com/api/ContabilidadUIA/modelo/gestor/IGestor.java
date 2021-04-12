package uia.com.api.ContabilidadUIA.modelo.gestor;

import java.util.Map;

import uia.com.api.ContabilidadUIA.modelo.clientes.InfoUIA;
import uia.com.api.ContabilidadUIA.modelo.clientes.ListaInfoUIA;

public interface IGestor {
	
	
	public void Print();
	public void Lee();
	public void Busca();	
	public void salva();
	public InfoUIA busca(String id);
	public Map<String, InfoUIA> getCatalogoMaestro();
	public ListaInfoUIA getListaInfoUIA();
	public InfoUIA agregaCatalogo(InfoUIA newCatalogo);
	public IGestor getGestor();
	public void setGestor(IGestor p);	
	
	
}
