package hdli.auth.service.impl;

import hdli.auth.model.dto.ProjectCreateDto;
import hdli.auth.model.dto.ProjectDetailDTO;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    public ProjectDetailDTO createProject(ProjectCreateDto project) {
        // TODO: Implement project creation logic
        return new ProjectDetailDTO();
    }
}