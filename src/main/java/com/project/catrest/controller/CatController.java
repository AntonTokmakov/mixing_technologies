package com.project.catrest.controller;

import com.project.catrest.DTO.CatDto;
import com.project.catrest.entry.Cat;
import com.project.catrest.repository.CatRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "cat_controller")
@RestController
@RequiredArgsConstructor
@Slf4j
public class CatController {

    public final CatRepository catRepository;

    @Operation(
            summary = "Кладет нового кота в базу",
            description = "Получает DTO кота и Builder ом собирает и сохраняет сущность кота в базу"
    )
    @PostMapping("api/cat")
    public HttpStatus addCat(@RequestBody CatDto cat){
        log.info("New row:" + catRepository.save(Cat.builder()
                        .age(cat.getAge())
                        .name(cat.getName())
                        .weight(cat.getWeight())
                        .build()));
        return HttpStatus.OK;
    }

    @GetMapping("api/cat")
    public List<Cat> getCat(){
        return catRepository.findAll();
    }

    @GetMapping("api/cat/{id}")
    public Cat getCatById(@PathVariable int id){
        return catRepository.findById(id).orElseThrow();
    }

    @DeleteMapping("api/cat/{id}")
    public HttpStatus deleteCat(@PathVariable int id){
        catRepository.deleteById(id);
        return HttpStatus.OK;
    }

    @PutMapping("api/cat")
    public String updateCat(@RequestBody Cat cat){
        if (!catRepository.existsById(cat.getId())){
            return "Not such row";
        }
        return catRepository.save(cat).toString();
    }


}
