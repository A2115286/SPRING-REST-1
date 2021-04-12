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


	
		
		/*
		public ArrayList<ClienteJSP> getListaProveedores() {
			return listaProveedores;
		}


		public void setListaProveedores(ArrayList<ClienteJSP> listaProveedores) {
			this.listaProveedores = listaProveedores;
		}


		public DecoradorProveedores getGestorProveedores() {
			return gestorProveedores;
		}

		public void setGestorProveedores(DecoradorProveedores gestorProveedores) {
			this.gestorProveedores = gestorProveedores;
		}


		public ClienteJSP getClienteById(String clienteId) {
			// TODO Auto-generated method stub
			return null;
		}


		public void borraCliente(String clienteId) {
			// TODO Auto-generated method stub
			
		}


		public ArrayList<ClienteJSP> getAllClientes() {
			// TODO Auto-generated method stub
			return null;
		}


		public void checkCliente(ClienteJSP cliente) {
			// TODO Auto-generated method stub
			
		}


		public ArrayList<ClienteJSP> getCuentas(String clienteName) 
		{
			this.listaCuentas = proveedor.getListaCuentas();
			return this.listaCuentas;
		}


		public ArrayList<ClienteJSP> getCompras(String clienteId) {
			this.clienteId = clienteId;
			proveedor = (Proveedor) this.gestorProveedores.busca(clienteId);
			listaCompras = proveedor.getLista();
			this.getCuentas(clienteId);
			return listaCompras;
		}
		
		public ArrayList<ClienteJSP> getCheques(String clienteId) {
			this.clienteId = clienteId;
			proveedor = (Proveedor) this.gestorProveedores.busca(clienteId);
			listaCheques = proveedor.getListaCheques();
			this.getCuentas(clienteId);
			return listaCheques;
		}

		public ArrayList<ClienteJSP> getListaCompras(String clienteId) {
			this.clienteId = clienteId;
			getCompras(this.clienteId);
			return listaCompras;
		}
		
		public ArrayList<ClienteJSP> getListaCheques(String clienteId) {
			this.clienteId = clienteId;
			getCheques(this.clienteId);
			return listaCheques;
		}
		
		
		

		public ArrayList<ClienteJSP> getListaCompras() {
			return listaCompras;
		}

		public ArrayList<ClienteJSP> getListaCuentas() {
			return listaCuentas;
		}
		

		public ArrayList<ClienteJSP> getListaCheques() {
			return listaCheques;
		}
		*/
}
