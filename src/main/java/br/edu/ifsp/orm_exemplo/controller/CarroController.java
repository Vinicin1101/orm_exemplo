package br.edu.ifsp.orm_exemplo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.edu.ifsp.orm_exemplo.model.Carro;
import br.edu.ifsp.orm_exemplo.repository.CarroRepository;

@RestController
@CrossOrigin
public class CarroController {

    @Autowired // ?
    CarroRepository carroRepository;

    @PostMapping("/carro")
    public void addCarro(@RequestBody Carro carro){
        carroRepository.save(carro);
    }

    @GetMapping("/carro")
    public List<Carro> getCarros(){
        return (List<Carro>) carroRepository.findAll();
    }
}