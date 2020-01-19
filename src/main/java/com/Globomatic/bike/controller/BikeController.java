package com.Globomatic.bike.controller;

import com.Globomatic.bike.model.Bike;
import com.Globomatic.bike.service.BikeService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController

public class BikeController {
    private BikeService bikeService;

    public BikeController(BikeService bikeService){
        this.bikeService = bikeService;
    }

    @GetMapping("/api/v1/bikes")
    public ResponseEntity<Iterable<Bike>> index(){
        return new ResponseEntity<>(bikeService.index(), HttpStatus.OK);
    }
    @GetMapping("/api/v1/bikes/{id}")
    public ResponseEntity<Bike> show(@PathVariable Integer id){
        return new ResponseEntity<>(bikeService.show(id),HttpStatus.OK);
    }
    @PostMapping("/api/v1/bikes")
   public ResponseEntity<Bike> create(@RequestBody Bike bike) {
        return new ResponseEntity<>(bikeService.create(bike),HttpStatus.CREATED);
    }
    @DeleteMapping("/api/v1/bikes/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Integer id){
        return new ResponseEntity<>(bikeService.delete(id),HttpStatus.OK);
    }


}