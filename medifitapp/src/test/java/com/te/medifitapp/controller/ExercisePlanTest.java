package com.te.medifitapp.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.te.medifitapp.bean.DietPlan;
import com.te.medifitapp.bean.ExercisePlans;
import com.te.medifitapp.service.MedifitService;

@WebMvcTest(MedifitController.class)
@RunWith(SpringRunner.class)
public class ExercisePlanTest {

	@Autowired
	MockMvc mvc;

	@Autowired
	ObjectMapper mapper;

	@MockBean
	private MedifitService service;
	
	@Test
	public void testGetData() throws Exception {
		ExercisePlans app = new ExercisePlans();
		app.setId(12345);
		app.setDescription("for those who falls under bmi under 25");
		
		Mockito.when(service.exercise(app)).thenReturn(app);
		String json = mapper.writeValueAsString(app);
		System.out.println(json);
		mvc.perform(post("/exerciseregister").contentType(MediaType.APPLICATION_JSON).characterEncoding("utf-8")
				.content(json).accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(jsonPath("$.data.description", Matchers.equalTo("for those who falls under bmi under 25")));


	

		
		
	}
	}
		
		
		