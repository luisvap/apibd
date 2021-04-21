package br.uniso.apibd.model.repository;

import br.uniso.apibd.model.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface AlunoRepository extends JpaRepository<Aluno, Integer>, JpaSpecificationExecutor<Aluno> {


    Aluno findAlunoByRa(int ra);

    Aluno findAlunoByNomeAndCurso(String nome, String curso);



    @Query("select a from Aluno a where a.idade = :idade or a.curso like :curso")
    List<Aluno> findAlunoByIdadeOrCurso(@Param("idade")int idade, @Param("curso")String curso);
}