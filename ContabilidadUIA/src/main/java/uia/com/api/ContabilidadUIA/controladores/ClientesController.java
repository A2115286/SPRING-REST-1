package uia.com.api.ContabilidadUIA.controladores;


import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
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
	
	@RequestMapping("clientes")
	public ResponseEntity<List<InfoUIA>> getAllClientes(){
		System.out.println("Saludos desde getAllClientes()");
		return ResponseEntity.ok(clientes.getListaProveedores());
	}
	
	
}
