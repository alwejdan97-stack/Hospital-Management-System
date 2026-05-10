package Behaviour;

import Entity.Appointment;

public interface AppointmentInterface {
    Boolean reschedule(Appointment appointment);
    Boolean cancel(Appointment appointment);
    Boolean complete(Appointment appointmentComplete);
}
