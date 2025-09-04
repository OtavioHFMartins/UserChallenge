package challenge.challenge.controller;

import challenge.challenge.dto.UserDto;
import challenge.challenge.service.UserStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


    @RestController
    @RequestMapping("/users")
    public class UserController {

        @Autowired
        private UserStorageService userStorageService;

        @PostMapping
        public String createUser(@RequestBody UserDto userDto) {
            userStorageService.saveUser(userDto);
            return "Usuário salvo com sucesso!";
        }

        @GetMapping
        public List<UserDto> listUsers() {
            return userStorageService.getAllUsers();
        }
    }

