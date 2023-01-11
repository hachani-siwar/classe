package com.example.project.services;

import com.example.project.Dao.ClassRepository;
import com.example.project.Objects.Classe;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ClasseService {
    private final ClassRepository classRepoitory;
    public void addClass(Classe classe) {
    classRepoitory.insert(classe);
    }

    public void updateClasse(Classe classe){
     //   Classe savedClasse=classRepoitory.findById(classe.getId()).orElseThrow(()-> new RuntimeException(String.format("cannot find the class id %s",classe.getId())));
      //  savedClasse.setName(classe.getName());
      //  savedClasse.setClasseGrade(classe.getClasseGrade());
        classRepoitory.save(classe);
    }
    public Classe getClass(String name){
        return  classRepoitory.findByName(name).orElseThrow(()->
                new RuntimeException(String.format("cannot find class by name: %s",name)));
    }
    public List<Classe> getAllClasses(){

        return classRepoitory.findAll();
    }
 public void deleteClass(String id){
        classRepoitory.deleteById(id);

 }

}
