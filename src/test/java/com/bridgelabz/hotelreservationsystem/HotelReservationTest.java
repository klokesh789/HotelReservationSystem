package com.bridgelabz.hotelreservationsystem;

import org.junit.Assert;
import org.junit.Test;

public class HotelReservationTest {
	@Test
	public void givenHotelInformation_WhenCorrect_ShouldReturnTrue() {
	HotelRegistrationMethod hotelRegistrationMethod = new HotelRegistrationMethod();
	int numberOfHotels = hotelRegistrationMethod.NumberOfHotellist();
	Assert.assertEquals(3, numberOfHotels);
	
	}
	

}
