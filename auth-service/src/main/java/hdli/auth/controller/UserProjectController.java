package hdli.auth.controller;

import hdli.auth.service.impl.UserProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user-projects")
public class UserProjectController {

    @Autowired
    private UserProjectService userProjectService;

    @PutMapping
    public UserProject assignProjectRole(@RequestBody UserProject userProject) {
        return userProjectService.assignProjectRole(userProject);
    }
}