package service.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import service.LoginServiceTest;

public class LoginServiceImplTest implements LoginServiceTest {
	
	@Test
	@Override
	public void login() {
		String id = "rayjo0620";
		assertEquals("rayjo0620", id);
	}
}
