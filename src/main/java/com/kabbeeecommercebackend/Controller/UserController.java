package com.kabbeeecommercebackend.Controller;

import com.kabbeeecommercebackend.Service.UserService;
import com.kabbeeecommercebackend.domain.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    @GetMapping("/name")
//    public String getUserByUsername(@RequestParam("username")String username){
//        return userService.getUserByUsername(username);
    public String getUserByUsername(){
        return "miki";
    }



    @GetMapping("/{id}")
    public UserDto getUserById(@PathVariable long id) {
        return userService.getUserById(id);
    }
    @PostMapping
    public void addUser(@RequestBody UserDto userDto){
        userService.addUser(userDto);
    }

}
