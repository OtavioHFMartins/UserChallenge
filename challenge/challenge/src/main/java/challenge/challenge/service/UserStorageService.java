package challenge.challenge.service;

import challenge.challenge.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserStorageService {

    private final List<UserDto> users = new ArrayList<>();


    public void saveUser(UserDto user) {
        users.add(user);
    }

    public List<UserDto> getAllUsers() {
        return users;
    }

    public void saveUsers(List<UserDto> userList) {
        users.addAll(userList);
    }
}
