package challenge.challenge.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TeamDto {

    private String name;

    private Boolean leader;

    private List<ProjectDto> projects;
}
