package uia.com.api.ContabilidadUIA.modelo;

import java.util.ArrayList;
import java.util.HashMap;

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
		private InfoUIA newCliente;
		
		


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
		
		public InfoUIA agregaCatalogo(InfoUIA newCliente) {
			
			return gestorProveedores.agregaCatalogo(newCliente);
		}

		public Gestor getContabilidad() {
			return contabilidad;
		}


		public void setContabilidad(Gestor contabilidad) {
			this.contabilidad = contabilidad;
		}


		public DecoradorProveedores getGestorProveedores() {
			return gestorProveedores;
		}


		public void setGestorProveedores(DecoradorProveedores gestorProveedores) {
			this.gestorProveedores = gestorProveedores;
		}


		public Proveedor getProveedor() {
			return proveedor;
		}


		public void setProveedor(Proveedor proveedor) {
			this.proveedor = proveedor;
		}


		public String getClienteId() {
			return clienteId;
		}


		public void setClienteId(String clienteId) {
			this.clienteId = clienteId;
		}


		public ArrayList<InfoUIA> getListaproveedores() {
			return listaproveedores;
		}


		public void setListaproveedores(ArrayList<InfoUIA> listaproveedores) {
			this.listaproveedores = listaproveedores;
		}
		
		public InfoUIA getNewCliente() {
			return newCliente;
		}


		public void setNewCliente(InfoUIA newCliente) {
			this.newCliente = newCliente;
		}

		
	
		
}
