package uia.com.api.ContabilidadUIA.controladores;


import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import uia.com.api.ContabilidadUIA.modelo.clientes.InfoUIA;
import uia.com.api.ContabilidadUIA.modelo.ClientesRepositorio;


@RestController
public class ClientesController {
	
/*
		
	/*
	 * Get all Clientes
	 * @return a controller
	 */
	private ClientesRepositorio clientes = new ClientesRepositorio();
	
	@RequestMapping("/clientes")
	public ResponseEntity<List<InfoUIA>> getAllClientes(){
		System.out.println("Saludos desde getAllClientes()");
		return ResponseEntity.ok(clientes.getListaProveedores());
	}
	
	/*
	 * Get Clientes by clienteId
	 * @param clienteId
	 * @param a controller
	 */
	
	@RequestMapping(value="clientes/{clienteId}", method=RequestMethod.GET)
	public ResponseEntity<InfoUIA> clientebyId(@PathVariable String clienteId) throws ClassNotFoundException{
		System.out.println("Saludos desde getAllClientes()");
		return ResponseEntity.ok((InfoUIA)clientes.getProveedor(clienteId));
	}
	
	/*
	 * Save a new cliente
	 * @param cliente
	 * @return 
	 */
	@RequestMapping(value="clientes", method=RequestMethod.POST)
	public ResponseEntity<InfoUIA> agregaCliente(@RequestBody InfoUIA newCliente){
		System.out.println("Saludos desde agregaCliente()");
		return ResponseEntity.ok((InfoUIA)clientes.agregaCatalogo(newCliente));
	}
	
	
}
