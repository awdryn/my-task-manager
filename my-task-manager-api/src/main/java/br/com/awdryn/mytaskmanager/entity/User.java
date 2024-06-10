package br.com.awdryn.mytaskmanager.entity;

import br.com.awdryn.mytaskmanager.dto.UserDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private String login;
    private String password;

    public User(UserDTO dto){
        this.id = dto.getId();
        this.name = dto.getName();
        this.email = dto.getEmail();
        this.phoneNumber = dto.getPhoneNumber();
        this.login = dto.getLogin();
        this.password = dto.getPassword();
    }
}
