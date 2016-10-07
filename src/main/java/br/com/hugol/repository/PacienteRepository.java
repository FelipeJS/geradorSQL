package br.com.hugol.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.hugol.entity.Paciente;

public interface PacienteRepository extends CrudRepository<Paciente, Long> {
	public Paciente findOneByCdPaciente(Long cd_paciente);
}
