package challenge.challenge.repository;

import challenge.challenge.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {

   private final List<UserDto> usersRepository;

   @Override
   public List<UserDto> getAllUsersWithScoreHigherThan(Integer score) {
      return List.of();
   }
}
