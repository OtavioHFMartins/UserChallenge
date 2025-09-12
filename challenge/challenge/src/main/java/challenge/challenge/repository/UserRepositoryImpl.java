package challenge.challenge.repository;

import challenge.challenge.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {

      private List<UserDto> userDtos = new ArrayList<>();

   private final List<UserDto> usersRepository;

   @Override
   public List<UserDto> getAllUsers() {
      return userDtos;
   }

   @Override
   public List<UserDto> getAllUsersWithScoreHigherThan(Integer score, Boolean active) {

      return userDtos.stream()
              .filter(u -> u.getScore() > score && Boolean.TRUE.equals(u.getActive()) == active)
              .collect(Collectors.toList());
   }
}
