package com.hospital_appointment.appointment_system.Controller;

import com.hospital_appointment.appointment_system.Model.Users;
import com.hospital_appointment.appointment_system.Service.UsersService;
import jakarta.persistence.GeneratedValue;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/UsersHospital")
public class UsersController {
    @Autowired
    private UsersService usersService;
    @GetMapping("/getUsers")
    public List<Users> getAllUsers(){
        return this.usersService.getAllUsers();
    }
    @PostMapping("/addUsers")
    public void addAllUsers(@RequestBody Users users){

        usersService.addAll(users);
    }
    @GetMapping("getUsersById/{user_id}")
    public Users findByUserId(@PathVariable ("user_id")long user_id){
        return this.usersService.getUserById(user_id);
    }
    @DeleteMapping("/delete/{user_id}")
    public void deleteUserById(@PathVariable ("user_id")long user_id){
        this.usersService.deleteByUserId(user_id);
    }


}
