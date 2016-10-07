package br.com.hugol.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.hugol.entity.Paciente;
import br.com.hugol.repository.PacienteRepository;

@Service
public class PacienteService implements PacienteRepository{
	
	@Autowired
	private PacienteRepository pacienteRepository;
	
	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(Long arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Paciente arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Iterable<? extends Paciente> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean exists(Long arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Paciente> findAll() {
		return null;
	}

	@Override
	public Iterable<Paciente> findAll(Iterable<Long> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Paciente findOne(Long arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Paciente> S save(S paciente) {
		return pacienteRepository.save(paciente);
	}

	@Override
	public <S extends Paciente> Iterable<S> save(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Paciente findOneByCdPaciente(Long cd_paciente) {
		return pacienteRepository.findOneByCdPaciente(cd_paciente);
	}

}
