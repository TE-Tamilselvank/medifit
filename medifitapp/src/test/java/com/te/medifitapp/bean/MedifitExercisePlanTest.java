package com.te.medifitapp.bean;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MedifitExercisePlanTest {

	String json="{\"id\":3300,\"description\":\"for fat people\",\"plan1\":\"yoga\",\"plan2\":null,\"plan3\":null,\"plan4\":null}"
			+ "";
	ObjectMapper mapper = new ObjectMapper();
	
	@Test
	void test() throws JsonProcessingException {
		ExercisePlans app = new ExercisePlans();
		
		app.setId(3300);
		app.setDescription("for fat people");
		app.setPlan1("yoga");
		
		System.out.println(mapper.writeValueAsString(app));
		
		ExercisePlans medi=mapper.readValue(json, ExercisePlans.class);
		
		assertEquals(json, mapper.writeValueAsString(medi));
		
		
	} 
}
