package challenge.challenge.repository;

import challenge.challenge.dto.UserDto;

import java.util.List;

public interface UserRepository {

    List<UserDto> getAllUsers();

    List<UserDto> getAllUsersWithScoreHigherThan(Integer score, Boolean active);
}
