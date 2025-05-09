package com.example.Job_App.Service;

import com.example.Job_App.model.JobPost;
import com.example.Job_App.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobpost){
           repo.addJob(jobpost);
    }

    public List<JobPost> getAllJobs(){
           return repo.getAllJobs();
    }
}
