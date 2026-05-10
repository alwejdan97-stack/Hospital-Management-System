package Behaviour;

import Entity.Appointment;

import java.time.LocalDate;

public interface AppointmentInterface {
    void reschedule(LocalDate newDate, String newTime);
    void cancel(String status);
    void complete(String status);
}
