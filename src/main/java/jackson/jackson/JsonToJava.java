package jackson.jackson;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJava {
    public static void main(String[] args) {
    	
    	//String json="{ \"id\": 1, \"name\": \"John Doe\",\"position\": \"Software Engineer\",\"salary\": 60000,\"department\": \"Development\",\"email\": \"john.doe@example.com\" }";
    
        ObjectMapper objectMapper = new ObjectMapper();
       

        try {
            
        	File file = new File("D:\\Spring\\jackson\\src\\main\\java\\jackson\\jackson\\generated.json");
            List<Person> persons = objectMapper.readValue(file, new TypeReference<List<Person>>() {});

            for (Person person : persons) {
            	    System.out.println(person.getId());
            	    System.out.println(person.getPosition());
            	    System.out.println(person.getSalary());
            	    System.out.println(person.getDepartment());
            	    System.out.println(person.getName());
            	    System.out.println(person.getEmail());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




    