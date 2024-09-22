//package com.project.catrest.controller;
//
//import com.project.catrest.entity.Dog;
//import com.project.catrest.repository.DogRepository;
//import lombok.NoArgsConstructor;
//import lombok.RequiredArgsConstructor;
//import org.apache.kafka.common.quota.ClientQuotaAlteration;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//import java.util.UUID;
//
//@RestController
//@RequestMapping("api/dogs")
//@RequiredArgsConstructor
//public class DogController {
//
//    private final DogRepository dogRepository;
//
//    @GetMapping("all")
//    public ResponseEntity<List<Dog>> getAllDogs(){
//        return new ResponseEntity<>(dogRepository.findAll(), HttpStatus.OK);
//    }
//
//    @GetMapping
//    public ResponseEntity<Dog> getDogByName(@RequestParam String name){
//
//        Optional<Dog> dog = dogRepository.findByName(name);
//        if (dog.isEmpty()){
//            return ResponseEntity
//                    .status(HttpStatus.NOT_FOUND)
//                    .build();
//        } else {
//            return new ResponseEntity<>( dog.get(), HttpStatus.OK);
//        }
//    }
//
//    @PostMapping
//    public Dog putDogInfo(@RequestBody Dog dog){
//        dog.setId(UUID.randomUUID());
//        return dogRepository.save(dog);
//    }
//
//}
