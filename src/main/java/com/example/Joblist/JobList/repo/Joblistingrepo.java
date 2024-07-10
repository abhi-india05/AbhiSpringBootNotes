package com.example.Joblist.JobList.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.Joblist.JobList.pojo.Joblisting;

@Repository
public interface Joblistingrepo extends MongoRepository<Joblisting,String>{
    Joblisting findByTitle(String title);
    
}
