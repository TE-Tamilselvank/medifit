package com.te.medifitapp.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.text.ParseException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.te.medifitapp.bean.DietPlan;
import com.te.medifitapp.bean.MedifitApp;
import com.te.medifitapp.dao.DietDAO;
import com.te.medifitapp.dao.MedifitDAO;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class DietServiceImplTest {


	@Autowired
	private MedifitService service;
	
	@MockBean
	private DietDAO dao;
	
	@Test
	public void serviceTest() throws ParseException {
		DietPlan app = new DietPlan();
		
		app.setId(1000);
		app.setWheyProtein("muscle protein");
		
		//MedifitApp app = new MedifitApp("vaithi","vaithi123","9876598760","vaithi@gmail.com",70,169,"male","kumbakonam",24,"vathi123",25);
		//EmployeeInfo info = new EmployeeInfo(100, "Raj", "raj@gmail.com", "rr", sdf.parse("12/12/2000"), 2321321L);
		when(service.register(app)).thenReturn(app);
		assertEquals(app, service.register(app));
	}


}
