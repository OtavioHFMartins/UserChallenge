package challenge.challenge.config;


import challenge.challenge.dto.UserDto;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;
import java.util.List;


@Configuration
public class LoadDataConfig {

    @Autowired
    private ObjectMapper objectMapper;


    @Value("${app.file.path}")
    private String filePath;

    @SneakyThrows
    @Bean
    public List<UserDto> loadJsonFile(){
        File file = new File(filePath);

        List<UserDto> usuarios = objectMapper.readValue(file, new TypeReference<List<UserDto>>() {});
        return usuarios;
    }

}




