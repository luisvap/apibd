package br.uniso.apibd.model.repository;

import br.uniso.apibd.model.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AlunoRepository extends JpaRepository<Aluno, Integer>, JpaSpecificationExecutor<Aluno> {

}