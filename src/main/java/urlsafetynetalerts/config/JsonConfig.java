package urlsafetynetalerts.config;

import com.fasterxml.jackson.databind.*;
import org.springframework.context.annotation.*;

@Configuration
public class JsonConfig {

    ObjectMapper objectMapper = new ObjectMapper();

    @Bean
    public ObjectMapper ObjectMapper(){
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        return objectMapper;
    }
}
