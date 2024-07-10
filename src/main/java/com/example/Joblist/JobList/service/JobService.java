package com.example.Joblist.JobList.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Joblist.JobList.pojo.Joblisting;
import com.example.Joblist.JobList.repo.Joblistingrepo;
@Service
public class JobService {
    @Autowired
    Joblistingrepo joblistingrepo;
    
    public List<Joblisting> showall(){
       return joblistingrepo.findAll();
    }
    public Joblisting showspecific(String title){
        return joblistingrepo.findByTitle(title);
    }
    public Joblisting insertinto(Joblisting job){
       return joblistingrepo.save(job);
    }
    public Joblisting putrequest(String title){
        return joblistingrepo.findByTitle(title);
    }
    public void putrequestprocess(Joblisting joblisting){
        if

    }
}

//here Joblisting is pojo and joblistingrepo is a repository
