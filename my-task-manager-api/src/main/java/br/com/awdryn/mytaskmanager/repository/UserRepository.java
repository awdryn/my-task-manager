package br.com.awdryn.mytaskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.awdryn.mytaskmanager.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
