package uia.com.api.ContabilidadUIA.modelo;

import java.util.ArrayList;

import uia.com.api.ContabilidadUIA.modelo.clientes.InfoUIA;
import uia.com.api.ContabilidadUIA.modelo.gestor.DecoradorProveedores;
import uia.com.api.ContabilidadUIA.modelo.gestor.*;
import uia.com.api.ContabilidadUIA.modelo.proveedores.Proveedor;


public class ClientesRepositorio {
			
	    public Gestor contabilidad =  null;
		public DecoradorProveedores gestorProveedores = null;		

		public Proveedor proveedor = null;
		public String clienteId="";
		public ArrayList<InfoUIA> listaproveedores;

		public ClientesRepositorio()
		{
		 contabilidad = new Gestor("D:\\ARCHIVOS\\Ibero\\CUARTO\\ARQUITECTURA_SOFTWARE\\SPRING-ContabilidadUIA\\ContabilidadUIA-Git\\ContabilidadUIA\\ListaProveedores.json");		
		 gestorProveedores = new DecoradorProveedores(contabilidad, "proveedor");		 
		 gestorProveedores.Print();
		 listaproveedores = gestorProveedores.getLista();
		}
		
		
		public ArrayList<InfoUIA> getListaProveedores() {
			return listaproveedores;
		}

		public Object getProveedor(String clienteId) {
			proveedor = (Proveedor)contabilidad.busca(clienteId);
			return proveedor;
		}

	
		
}
