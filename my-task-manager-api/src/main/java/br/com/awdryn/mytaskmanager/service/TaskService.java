package br.com.awdryn.mytaskmanager.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.awdryn.mytaskmanager.dto.TaskDTO;
import br.com.awdryn.mytaskmanager.entity.Task;
import br.com.awdryn.mytaskmanager.repository.TaskRepository;

@Service
public class TaskService {

    private TaskRepository repository;

    public TaskService(TaskRepository repository){
        this.repository = repository;
    }

    public List<TaskDTO> create(Task task){
        repository.save(task);

        return list();
    }

    public List<TaskDTO> list(){
        Sort sort = Sort.by("start")
        .ascending()
        .and(Sort.by("state"));

        return TaskDTO.getListBy(repository.findAll(sort));
    }

    public List<TaskDTO> update(Task task){
        repository.save(task);

        return list();
    }

    public List<TaskDTO> delete(Long id){
        repository.deleteById(id);
        
        return list();
    }
}
