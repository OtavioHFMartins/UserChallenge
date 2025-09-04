package challenge.challenge.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UserDto {

    private String id;

    private String name;

    private Integer age;

    private Integer score;

    private Boolean active;

    private String country;

    private TeamDto team;

    private List<LogDto> logs;
}
