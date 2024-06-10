package br.com.awdryn.mytaskmanager.service;

import java.util.List;

import br.com.awdryn.mytaskmanager.dto.UserDTO;

public interface UserService {

    UserDTO findBy(Long id);

    List<UserDTO> list();

    UserDTO save(UserDTO dto);

    void delete(Long id);

}