package com.Spring_API.Doctors_Appointment.Controller;

import com.Spring_API.Doctors_Appointment.Repository.AppointmentRepository;
import com.Spring_API.Doctors_Appointment.Services.Appointment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AppointmentController {

    @Autowired
    AppointmentRepository arepo;

    @GetMapping("/test")
    public String test(){
        return "This Is A Test Run";
    }

    @PostMapping("/save")
    public String save(@RequestBody Appointment app){
        arepo.save(app);
        return "Appointment Confirmed";
    }

    @GetMapping("/pname")
    public List<Appointment> findByName(@RequestParam String pname){
        return arepo.findByPname(pname);
    }

    @PutMapping("/upd/{appid}")
    public Appointment update(@PathVariable int appid, @RequestBody Appointment appointment) {

        Appointment a=arepo.findById(appid).get();
        a.setPname(appointment.getPname());
        a.setAtime(appointment.getAtime());
        a.setAdate(appointment.getAdate());
        a.setProblem(appointment.getProblem());
        return arepo.save(a);
    }

    @DeleteMapping("/cancel/{appid}")
    public String delete(@PathVariable int appid){
        arepo.deleteById(appid);
        return "The Appointment Has Been Cancled";
    }

}
