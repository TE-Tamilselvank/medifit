package com.te.medifitapp.bean;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MedifitAppTest {

	String json="{\"name\":\"tamil\",\"userName\":null,\"mobile\":null,\"mail\":null,\"weight\":null,\"height\":null,\"gender\":null,\"city\":\"chennai\",\"age\":22,\"pwd\":null,\"bmi\":null}"
			+ "";
	ObjectMapper mapper = new ObjectMapper();
	
	@Test
	void test() throws JsonProcessingException {
		MedifitApp app = new MedifitApp();
		
		app.setName("tamil");
		app.setAge(22);
		app.setCity("chennai");
	
		System.out.println(mapper.writeValueAsString(app));
		
		MedifitApp medi=mapper.readValue(json, MedifitApp.class);
		
		assertEquals(json, mapper.writeValueAsString(medi));
		
		
	} 
	
	
}
