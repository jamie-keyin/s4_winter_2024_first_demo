package com.keyin.blood.donor;

import com.keyin.blood.appointment.Appointment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

public class DonorTest {

    @Test
    public void testCanDonate() {
        Donor donorUnderTest = new Donor();

        Calendar donorLastDonationCalendar = Calendar.getInstance();
        donorLastDonationCalendar.set(2024, Calendar.JANUARY, 10);

        donorUnderTest.setLastDonationDate(donorLastDonationCalendar.getTime());

        Appointment appointmentUnderTest = new Appointment();

        Calendar appointmentDate = Calendar.getInstance();
        appointmentDate.set(2024,  Calendar.MARCH, 31);

        appointmentUnderTest.setDate(appointmentDate.getTime());

        Assertions.assertTrue(donorUnderTest.canDonate(appointmentUnderTest));
    }
}
