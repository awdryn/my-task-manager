package br.com.awdryn.mytaskmanager.dto;

import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;

import br.com.awdryn.mytaskmanager.entity.Task;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TaskDTO {
    private Long id;
    private String title;
    private String description;
    private String start;
    private String end;
    private String state;

    public TaskDTO(Task task){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        this.id = task.getId();
        this.title = task.getTitle();
        this.description = task.getDescription();
        this.start = task.getStart().format(formatter);
        this.end = task.getEnd().format(formatter);
        this.state = task.getState().getStatusDesc();
    }

    public static List<TaskDTO> getListBy(List<Task> taskList){
        List<TaskDTO> dtos = new ArrayList<TaskDTO>();
        for(Task task: taskList){
            dtos.add(new TaskDTO(task));
        }
        return dtos;
    }
}
