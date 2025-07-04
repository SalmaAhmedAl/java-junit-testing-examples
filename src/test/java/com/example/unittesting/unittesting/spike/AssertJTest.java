package com.example.unittesting.unittesting.spike;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class AssertJTest {
	
	@Test
	public void learning() {
		List<Integer> numbers = Arrays.asList(12, 15, 45);
		
		assertThat(numbers).contains(12).allMatch(x -> x < 100).noneMatch(x -> x > 100);
		
		assertThat("ABCDE").isNotEmpty().startsWith("A");
		
	}

}
