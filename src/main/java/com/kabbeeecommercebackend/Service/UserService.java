package com.kabbeeecommercebackend.Service;

import com.kabbeeecommercebackend.domain.dto.UserDto;

public interface UserService {

    UserDto getUserByUsername(String username);


    UserDto getUserById(long id);

    void addUser(UserDto userDto);



}
