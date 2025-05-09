package com.example.Job_App.repo;

import com.example.Job_App.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Java Developer", "Java Experience", 1, List.of("Java", "Spring Boot")),
            new JobPost(2, "Frontend Developer", "Frontend Experience", 2, List.of("JavaScript", "React")),
            new JobPost(3, "Data Scientist", "Machine Learning", 3, List.of("Python", "Azure", "TensorFlow")),
            new JobPost(4, "Network Engineer", "Computer Networking", 4, List.of("Cisco", "Networking", "Swift")),
            new JobPost(5, "Mobile App Developer", "Mobile App Development", 5, List.of("Kotlin", "Android Studio"))
    ));


    public List<JobPost> getAllJobs(){
            return jobs;
    }

    public void addJob(JobPost job){
        jobs.add(job);
        System.out.println(job);
    }

}
