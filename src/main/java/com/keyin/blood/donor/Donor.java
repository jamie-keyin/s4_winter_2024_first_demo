package com.keyin.blood.donor;

import com.keyin.blood.appointment.Appointment;

import java.util.Calendar;
import java.util.Date;

public class Donor {
    private Date lastDonationDate;


    public boolean canDonate(Appointment appointment) {
        if (lastDonationDate == null) {
            return true;
        } else {
            Calendar appointmentDateCalendar = Calendar.getInstance();
            appointmentDateCalendar.setTime(appointment.getDate());

            Calendar lastDonationDateCalendar = Calendar.getInstance();
            lastDonationDateCalendar.setTime(lastDonationDate);

            lastDonationDateCalendar.add(Calendar.DAY_OF_YEAR, 56);

            return appointmentDateCalendar.after(lastDonationDateCalendar);
        }
    }

    public Date getLastDonationDate() {
        return lastDonationDate;
    }

    public void setLastDonationDate(Date lastDonationDate) {
        this.lastDonationDate = lastDonationDate;
    }
}
