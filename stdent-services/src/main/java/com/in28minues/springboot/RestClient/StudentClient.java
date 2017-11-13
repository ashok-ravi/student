package com.in28minues.springboot.RestClient;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.datatype.joda.JodaModule;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.in28minues.springboot.model.Student;

public class StudentClient {
	public static void getEmployees() throws Exception
	{
	    final String uri = "http://localhost:8080/student";
	    ObjectMapper mapper = new ObjectMapper();
	    RestTemplate restTemplate = new RestTemplate();
	    mapper.registerModule(new JodaModule());
	    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	    HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
	    ResponseEntity<String> result = restTemplate.exchange(uri, HttpMethod.GET, entity, String.class);
	    List<Student> students = mapper.readValue(result.getBody(),new TypeReference<List<Student>>() {});
	    
	    for(int i=0;i<students.size();i++){
	    	System.out.println(students.get(i));
	    }
	}
}
