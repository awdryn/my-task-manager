package br.com.awdryn.mytaskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.awdryn.mytaskmanager.entity.Task;

public interface TaskRepository extends JpaRepository<Task,Long>{

}
