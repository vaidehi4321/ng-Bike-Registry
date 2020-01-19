package com.Globomatic.bike.service;

import com.Globomatic.bike.model.Bike;
import com.Globomatic.bike.repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BikeService {
private BikeRepository repository;
@Autowired
    public BikeService(BikeRepository repository){
    this.repository = repository;
}
public Iterable<Bike> index(){
    return repository.findAll();
}
public Bike show(Integer id){
    return repository.findById(id).get();
}
public Bike create(Bike bike){
    return  repository.save(bike);
}
public Boolean delete(Integer id){
    repository.deleteById(id);
    return true;
}
public Bike update(Integer id, Bike newBike){
    Bike bike = repository.findById(id).get();
    bike.setId(newBike.getId());
    bike.setContact(newBike.getContact());
    bike.setName(newBike.getName());
    bike.setEmail(newBike.getEmail());
    bike.setModel(newBike.getModel());
    bike.setPhone(newBike.getPhone());
    bike.setSerialNumber(newBike.getSerialNumber());
    bike.setPurchaseDate(newBike.getPurchaseDate());
    bike.setPurchasePrice(newBike.getPurchasePrice());
    return repository.save(bike);
}

}
