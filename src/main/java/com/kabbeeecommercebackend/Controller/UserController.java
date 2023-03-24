package com.kabbeeecommercebackend.Controller;

import com.kabbeeecommercebackend.Service.UserService;
import com.kabbeeecommercebackend.domain.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/name")
    public UserDto getUserByUsername(@RequestParam("username")String username){
        return userService.getUserByUsername(username);
    }



}
