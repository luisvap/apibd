package br.uniso.apibd.controller;


import br.uniso.apibd.model.entity.Aluno;
import br.uniso.apibd.model.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AlunoController {


    @Autowired
    private AlunoRepository repository;



    // criar um endpoint pra gravar no banco
    @PostMapping("/alunos")
    public boolean gravarAluno(@RequestBody Aluno aluno){

        Aluno gravado = repository.save(aluno);
        if(gravado == null){
            //nao gravou
            return false;
        }
        else{
            // gravou no banco com sucesso
            return true;
        }
    }

    // criar um endpoint para ler do banco

    @GetMapping("/alunos")
    public List<Aluno> listarAlunos(){
        return repository.findAll();
    }



    @GetMapping("/alunos/ra")
    public Aluno listarAlunoPorRa(@RequestParam int ra){
        Aluno retornado = repository.findAlunoByRa(ra);

        return retornado;
    }



    @GetMapping("/alunos/nome")
    public Aluno listarAlunoPorNome(@RequestParam String nome, @RequestParam String curso){
        Aluno retornado = repository.findAlunoByNomeAndCurso(nome, curso);
        return retornado;
    }


    @GetMapping("/alunos/idadeCurso")
    public List<Aluno> listarAlunoPorIdadeCurso(@RequestParam int idade, @RequestParam String curso){
        List<Aluno> alunos = repository.findAlunoByIdadeOrCurso(idade, curso);
        return alunos;
    }

}
