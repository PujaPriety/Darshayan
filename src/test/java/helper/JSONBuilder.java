package helper;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;

@Data
public class JSONBuilder {
    private static ObjectMapper objectMapper;
    private String name;

    static {
        objectMapper = new ObjectMapper();
    }


    public static String getJson(Object object) throws JsonProcessingException {
        return objectMapper.writeValueAsString(object);

    }
}
