package com.casestudyhms;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//Database Initialization
@Repository
public interface CustomerRepository extends MongoRepository<Customer,String>{

}
