package com.example.Joblist.JobList.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Joblist.JobList.pojo.Joblisting;
import com.example.Joblist.JobList.service.JobService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;






@Controller
public class Joblistingcontroller {
   @Autowired
   JobService jobservice;

    @GetMapping("/listings")
    public String showlistings(Model model ){
        List<Joblisting> jobs=jobservice.showall();
        model.addAttribute("jobs",jobs);
        return "listings";

    }
    @GetMapping("/listings/{title}")
    public String showspecificname(@PathVariable String title,Model model){
        Joblisting foundjob=jobservice.showspecific(title);
        model.addAttribute("foundjob",foundjob);
        return "specificlisting";
    }
    @GetMapping("/listings/new")
    public String formlink(){
        return "form";
    }
    @PutMapping("/listings/{title}")
    public void putspecificname(@PathVariable String title){
        Joblisting joblist=jobservice.putrequest(title);
        jobservice.putrequestprocess(joblist);
    }

   
    
    @PostMapping("/listings/enter")
    public String postedlisting(@ModelAttribute Joblisting postjob){
        jobservice.insertinto(postjob);
        return "redirect:/listings";
    }
   
    
    
    
}
