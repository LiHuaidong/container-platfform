package hdli.auth.controller;

import hdli.auth.model.dto.ProjectCreateDto;
import hdli.auth.model.dto.ProjectDetailDTO;
import hdli.auth.service.impl.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/projects")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping
    public ProjectDetailDTO createProject(@RequestBody ProjectCreateDto project) {
        return projectService.createProject(project);
    }
}