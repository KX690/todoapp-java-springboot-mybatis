package com.kx690.todoapp.controller;


import com.kx690.todoapp.KXTasksService;
import com.kx690.todoapp.model.KXTask;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge =  3600)
@RequestMapping("/api/tasks")
public class KXTasksController {

    @GetMapping("/getAll")
    public ResponseEntity<List<KXTask>> getAllTasks() {

        List<KXTask> kxTask = null;
        KXTasksService kxTasksService = null;

        try{

            kxTasksService = new KXTasksService();
            kxTask = kxTasksService.getAll();


        }catch (Exception e){
            e.printStackTrace();
        }

        return ResponseEntity.ok().body(kxTask);
    }

    @PostMapping("/save")
    public ResponseEntity<KXTask> saveTask(@RequestBody KXTask kxTask) {

        KXTasksService kxTasksService = null;
        KXTask savedTask = null;

        try {

            kxTasksService = new KXTasksService();
            savedTask = kxTasksService.save(kxTask);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.ok().body(savedTask);
    }
}
