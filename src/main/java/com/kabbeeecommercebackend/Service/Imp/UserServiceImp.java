package com.kabbeeecommercebackend.Service.Imp;

import com.kabbeeecommercebackend.Repo.UserRepo;
import com.kabbeeecommercebackend.Service.UserService;

import com.kabbeeecommercebackend.domain.User;
import com.kabbeeecommercebackend.domain.dto.UserDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImp implements UserService {
    @Autowired
    UserRepo userRepo;


    @Autowired
    ModelMapper modelMapper;


    @Override
    public UserDto getUserById(long id) {
        return modelMapper.map(userRepo.findById(id).get(), UserDto.class);
    }


    @Override
    public UserDto getUserByUsername(String username) {
        return modelMapper.map(userRepo.findByUsername(username).get(), UserDto.class);
    }
   public void addUser(UserDto userDto){
        userRepo.save(modelMapper.map(userDto, User.class));
    }
}

