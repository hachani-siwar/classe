package com.example.project.controllers;

import com.example.project.Dao.ClassRepository;
import com.example.project.Objects.Classe;
import com.example.project.services.ClasseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/classes")
public class ClasseController {

    private final ClasseService classeService;
    private final ClassRepository classRepository;

    @PostMapping
    public ResponseEntity  addClass( Classe classe){
        classeService.addClass(classe);
        return  ResponseEntity.status(HttpStatus.CREATED).build();
    }
    @PutMapping
    public ResponseEntity updateClasse( Classe classe){
        classeService.updateClasse(classe);
        return ResponseEntity.status(HttpStatus.OK).build();
    }
    @GetMapping
    public ResponseEntity <List<Classe>> getAllClasses(){

        return ResponseEntity.ok((classeService.getAllClasses()));
    }
    @GetMapping("/{name}")
    public ResponseEntity  getClass(@PathVariable String name){
        return ResponseEntity.ok(classeService.getClass(name));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity deleteClass(@PathVariable String id){
        classeService.deleteClass(id);
        return ResponseEntity.noContent().build();
    }
}
