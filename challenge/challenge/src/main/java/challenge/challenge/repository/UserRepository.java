package challenge.challenge.repository;

import challenge.challenge.dto.UserDto;

import java.util.List;

public interface UserRepository {

    List<UserDto> getAllUsersWithScoreHigherThan(Integer score);
}
