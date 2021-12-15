package staff;

import com.fasterxml.jackson.core;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonParser {

    ObjectMapper objectMapper = new ObjectMapper();

    public Person parse() {
        
        JSONParser parser = new JSONParser();
        
        FileReader reader new FileReader(fileName:"3.hospital.json" ) {
            
            parser.parse(reader);
        }
        
                
    }

}
