package com.Spring_API.Doctors_Appointment.Repository;

import com.Spring_API.Doctors_Appointment.Services.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment,Integer> {

    List<Appointment> findByPname(String pname);
}
