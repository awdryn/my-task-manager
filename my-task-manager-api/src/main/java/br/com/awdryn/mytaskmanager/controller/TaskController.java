package br.com.awdryn.mytaskmanager.controller;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.awdryn.mytaskmanager.dto.TaskDTO;
import br.com.awdryn.mytaskmanager.service.TaskService;


@RestController
@RequestMapping("/tasks")
public class TaskController {
    
    private TaskService service;
    
    public TaskController(TaskService service){
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.GET, 
        produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<TaskDTO>> getList() {
        return new ResponseEntity<List<TaskDTO>>(service.list(), HttpStatus.OK);
    }
}
