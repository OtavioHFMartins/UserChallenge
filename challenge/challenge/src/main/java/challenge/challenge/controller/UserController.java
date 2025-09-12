package challenge.challenge.controller;

import challenge.challenge.dto.UserDto;
import challenge.challenge.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
    @RequestMapping("/users")
    public class UserController {

        @Autowired
        private UserRepository userRepository;

        @PostMapping
        @ResponseStatus(HttpStatus.CREATED)
        public String createUser(@RequestBody UserDto userDto) {
            return "Usuário salvo com sucesso!";
        }


        @GetMapping("/superusers")
        public Map<String, Object> getSuperUsers() {
            long startTime = System.currentTimeMillis();

            List<UserDto> superUsers = userRepository.getAllUsersWithScoreHigherThan(900, true);

            long endTime = System.currentTimeMillis();

            Map<String, Object> response = new HashMap<>();
            response.put("data", superUsers);
            response.put("processingTimeMs", endTime - startTime);
            response.put("timestamp", new Date());

            return response;
        }


    }

