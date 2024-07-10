package com.example.Joblist.JobList.pojo;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="jobpostings")
public class Joblisting {
  
    private String title;
    private String role;
    private String company;
    private int workexp;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getWorkexp() {
        return this.workexp;
    }

    public void setWorkexp(int workexp) {
        this.workexp = workexp;
    }

}
