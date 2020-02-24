import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {

  private JsonUtil() {
  }
  private static final ObjectMapper objectMapper = new ObjectMapper();

  public static String convertToJson(Object object) {
    //TODO: change the code to pass the test
    String jasonString = null;
    try {
      jasonString = objectMapper.writeValueAsString(object);
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }
    return jasonString;
  }
}
