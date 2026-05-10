package Behaviour;

import Entity.Appointment;

public interface AppointmentInterface {
    Boolean reschedule(String appointment);
    Boolean cancel(String appointment);
    Boolean complete(String appointmentComplete);
}
