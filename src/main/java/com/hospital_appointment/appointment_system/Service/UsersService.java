package com.hospital_appointment.appointment_system.Service;

import com.hospital_appointment.appointment_system.Model.Users;
import com.hospital_appointment.appointment_system.Repo.UsersRepo;
import org.hibernate.engine.jdbc.mutation.internal.PreparedStatementGroupSingleTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    @Autowired
    private UsersRepo usersRepo;
    //getting all the users
    public List<Users> getAllUsers(){
        return this.usersRepo.findAll();
    }
    //adding a user
    public void addAll(Users users){
        this.usersRepo.save(users);
    }
    //get by user_id

   public Users getUserById(long user_id){
       return this.usersRepo.findById(user_id).get();
   }
   //deleting the user by user_id

    public void deleteByUserId(long user_id){
        this.usersRepo.deleteById(user_id);
    }
}
