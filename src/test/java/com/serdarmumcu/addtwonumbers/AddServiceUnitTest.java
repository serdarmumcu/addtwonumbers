package com.serdarmumcu.addtwonumbers;

import com.serdarmumcu.addtwonumbers.service.AddService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddServiceUnitTest {

	@Test
	void addTwoNumbersTest() {
		AddService service = new AddService(); //Arrange
		double result = service.addTwoNumbers(5,3); //Act
		assertEquals(2,result); //Assert
	}

	@Test
	void addTwoDoubleNumbersTest() {
		AddService service = new AddService(); //Arrange
		double result = service.addTwoNumbers(5.3,3.3); //Act
		assertEquals(2.0,result); //Assert
	}

}
