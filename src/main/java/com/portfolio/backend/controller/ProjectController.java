package com.portfolio.backend.controller;

import com.portfolio.backend.model.Project;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*") // Allow all origins; change as needed for security
@RestController
@RequestMapping("/api") // Base URL will be /api/projects
public class ProjectController {

    @GetMapping("/projects")
    public List<Project> getProjects() {
        return List.of(
                new Project(
                        "Inventory Manager",
                        "A Spring Boot inventory system with part/product tracking and alerts.",
                        "https://via.placeholder.com/150"
                ),
                new Project(
                        "Workout Tracker",
                        "A basic fitness app for logging strength workouts and runs.",
                        "https://via.placeholder.com/150"
                ),
                new Project(
                        "Portfolio Website",
                        "This very site! Built with HTML, CSS, and a Spring Boot backend.",
                        "https://via.placeholder.com/150"
                )
        );
    }
}
