package br.com.awdryn.mytaskmanager.dto;

import java.util.ArrayList;
import java.util.List;

import br.com.awdryn.mytaskmanager.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDTO {

    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String login;
    private String password;

    public UserDTO(User user){
        this.id = user.getId();
        this.name = user.getName();
        this.email = user.getEmail();
        this.phoneNumber = user.getPhoneNumber();
        this.login = user.getLogin();
        this.password = user.getPassword();
    }

    public static List<UserDTO> getListBy(List<User> userList){
        List<UserDTO> dtos = new ArrayList<UserDTO>();
        for(User task: userList){
            dtos.add(new UserDTO(task));
        }
        return dtos;
    }
}
