package com.Globomatic.bike.repository;

import com.Globomatic.bike.model.Bike;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BikeRepository extends CrudRepository<Bike,Integer> {
}
