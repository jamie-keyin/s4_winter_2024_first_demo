package com.keyin.blood.donor;

import com.keyin.blood.appointment.Appointment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.util.Calendar;
import java.util.Date;

@Entity
public class Donor {

    @Id
    @SequenceGenerator(name = "donor_sequence", sequenceName = "donor_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "donor_sequence")
    private long id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
