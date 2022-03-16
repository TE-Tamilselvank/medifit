package com.te.medifitapp.bean;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MedifitDietPlanTest {

	String json="{\"id\":2200,\"wheyProtein\":\"wheyProtein\",\"breakfast\":\"low carb diet\",\"lunch\":null,\"dinner\":null}"
			+ "";
	ObjectMapper mapper = new ObjectMapper();
	
	@Test
	void test() throws JsonProcessingException {
		DietPlan app = new 	DietPlan();
		
		app.setId(2200);
		app.setWheyProtein("wheyProtein");
		app.setBreakfast("low carb diet");
	
		System.out.println(mapper.writeValueAsString(app));
		
		DietPlan medi=mapper.readValue(json, DietPlan.class);
		
		assertEquals(json, mapper.writeValueAsString(medi));
		
		
	} 

}
