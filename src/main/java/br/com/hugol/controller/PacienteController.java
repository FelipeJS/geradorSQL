package br.com.hugol.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.hugol.entity.Paciente;
import br.com.hugol.service.PacienteService;

@RestController
@RequestMapping("/paciente")
public class PacienteController {
	
	@Autowired
	private PacienteService pacienteService;
	
	@RequestMapping(value = "/novo", method = POST)
	public Paciente save(@RequestBody Paciente paciente){
		return pacienteService.save(paciente);
	}
	
	@RequestMapping(value = "/consultar", method = GET)
	public Paciente findOneByCdPaciente(Long cd_paciente){
		return pacienteService.findOneByCdPaciente(cd_paciente);
	}
}
