package com.example;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

	@Override
	public List<String> getUsers() {
		
		List<String> result = Arrays.asList("saugandh", "krupamay", "Prabhu", "Depanjan", "njfjisd");
		return result;
		
	}
	
}
