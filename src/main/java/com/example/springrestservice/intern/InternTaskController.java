package com.example.springrestservice.intern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/intern_task")
public class InternTaskController {

    @Autowired
    InternTaskService internTaskService;

    @GetMapping
    public List<InternTaskModel> getAllTask() {
        return internTaskService.getAllTask();
    }

    @PostMapping
    public void addTask(@RequestBody InternTaskModel internTaskModel) {
        internTaskService.addTask(internTaskModel);
    }
}
