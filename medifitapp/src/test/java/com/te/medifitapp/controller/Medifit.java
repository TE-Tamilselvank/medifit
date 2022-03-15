package com.te.medifitapp.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.te.medifitapp.bean.MedifitApp;
import com.te.medifitapp.service.MedifitService;

@WebMvcTest(MedifitController.class)
@RunWith(SpringRunner.class)
public class Medifit {

	@Autowired
	MockMvc mvc;

	@Autowired
	ObjectMapper mapper;

	@MockBean
	private MedifitService service;

	@Test
	public void testRegister() throws Exception {
		MedifitApp app = new MedifitApp();
		app.setUserName("tamil124");
		app.setName("tamilselvan");
		Mockito.when(service.getData(app.getUserName())).thenReturn(app);
		String json = mapper.writeValueAsString(app);
		System.out.println(json);
		mvc.perform(get("/getData/tamil124").contentType(MediaType.APPLICATION_JSON).characterEncoding("utf-8")
				.content(json).accept(MediaType.APPLICATION_JSON)).andExpect(status().isOk())
				.andExpect(jsonPath("$.data.name", Matchers.equalTo("tamilselvan")));

	}
}
