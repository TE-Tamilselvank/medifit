package com.te.medifitapp.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
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
import com.te.medifitapp.service.MedifitService;

@WebMvcTest(MedifitController.class)
@RunWith(SpringRunner.class)
public class DietPlanTest {

	@Autowired
	MockMvc mvc;

	@Autowired
	ObjectMapper mapper;

	@MockBean
	private MedifitService service;
	

	@Test
	public void testGetData() throws Exception {
		DietPlan app = new DietPlan();
		app.setId(1234);
		app.setWheyProtein("musclepower");
		
		Mockito.when(service.register(app)).thenReturn(app);
		String json = mapper.writeValueAsString(app);
		System.out.println(json);
		mvc.perform(post("/dietregister").contentType(MediaType.APPLICATION_JSON).characterEncoding("utf-8")
				.content(json).accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(jsonPath("$.data.wheyProtein", Matchers.equalTo("musclepower")));

	}

	
	
}
