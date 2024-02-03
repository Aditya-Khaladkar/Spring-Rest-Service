package com.example.springrestservice.intern;

import com.example.springrestservice.repository.intern_repository.InternTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InternTaskService {

    @Autowired
    InternTaskRepository internTaskRepository;

    // ADD TASK FOR INTERN
    public InternTaskModel addTask(InternTaskModel internTaskModel) {
        return internTaskRepository.save(internTaskModel);
    }

    public List<InternTaskModel> getAllTask() {
        return internTaskRepository.findAll();
    }
}
