package controller;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
public class HomeControllerTest {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeControllerTest.class);
	
	//private MockMvc mockMvc;
	
	@Test
	@Disabled
	public void Test() throws Exception {
		logger.info("Start junit5 test");
		
		String name = "rayjo0620";
		
		assertEquals("rayjo0620", name);
		
		//mockMvc.perform(MockMvcRequestBuilders.get("/"))
			//.andExpect(MockMvcResultMatchers.view().name("home"));
	}
	
	@Test
	void hello() {
		System.out.println("Hello world");
	}
	
}
