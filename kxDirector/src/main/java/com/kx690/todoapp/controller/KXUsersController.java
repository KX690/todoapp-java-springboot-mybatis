package com.kx690.todoapp.controller;


import com.kx690.todoapp.KXUsersService;
import com.kx690.todoapp.model.KXUser;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge =  3600)
@RequestMapping("/api/kxUsers")
public class KXUsersController {
    
    public ResponseEntity<List<KXUser>> getAllUsers() {

        KXUsersService kxUsersService = null;
        List<KXUser> users = null;
        try{

            kxUsersService = new KXUsersService();
             users = kxUsersService.getAll();

            return ResponseEntity.ok().body(users);


        }catch (Exception e){

            e.printStackTrace();

        }



        return ResponseEntity.ok().body(users);
    }


    public ResponseEntity<KXUser> insertUser(@RequestBody KXUser kxUser){


        KXUsersService kxUsersService = null;
        KXUser insertedUser = null;
        try {

            kxUsersService = new KXUsersService();
            insertedUser = kxUsersService.save(kxUser);




        }catch (Exception e){
            e.printStackTrace();

        }
        return ResponseEntity.ok().body(insertedUser);
    }
}
