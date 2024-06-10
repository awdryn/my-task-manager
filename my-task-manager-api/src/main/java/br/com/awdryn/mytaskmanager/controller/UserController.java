package br.com.awdryn.mytaskmanager.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.awdryn.mytaskmanager.dto.UserDTO;
import br.com.awdryn.mytaskmanager.service.UserService;


@RestController
@RequestMapping("/users")
public class UserController {

    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<UserDTO>> getList() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(service.list());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> findBy(@PathVariable("id") Long id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(service.findBy(id));
    }

    @PostMapping
    public ResponseEntity<UserDTO> create(@RequestBody UserDTO dto) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .contentType(MediaType.APPLICATION_JSON)
                .body(service.save(dto));
    }

    @PutMapping
    public ResponseEntity<UserDTO> update(@RequestBody UserDTO dto) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(service.save(dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
        service.delete(id);
        return ResponseEntity
                .status(HttpStatus.NO_CONTENT)
                .contentType(MediaType.APPLICATION_JSON)
                .build();
    }
}
