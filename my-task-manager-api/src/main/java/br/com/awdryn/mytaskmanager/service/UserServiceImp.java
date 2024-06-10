package br.com.awdryn.mytaskmanager.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.awdryn.mytaskmanager.dto.UserDTO;
import br.com.awdryn.mytaskmanager.entity.User;
import br.com.awdryn.mytaskmanager.repository.UserRepository;

@Service
public class UserServiceImp implements UserService {

    private UserRepository repository;

    public UserServiceImp(UserRepository repository){
        this.repository = repository;
    }

    @Override
    public UserDTO findBy(Long id){
        Optional<User> opt = repository.findById(id);
        
        if(opt.isEmpty())
            return null;

        return new UserDTO(opt.get());
    }

    @Override
    public List<UserDTO> list(){
        Sort sort = Sort.by("name").ascending();
        return UserDTO.getListBy(repository.findAll(sort));
    }

    @Override
    public UserDTO save(UserDTO dto){
        UserDTO newUser = new UserDTO(repository.save(new User(dto)));
        return newUser;
    }

    @Override
    public void delete(Long id){
        repository.deleteById(id);
    }
}
