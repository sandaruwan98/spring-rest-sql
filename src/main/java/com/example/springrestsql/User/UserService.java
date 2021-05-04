package com.example.springrestsql.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private  UserRepository userRepository;

    List<User> getUsers(){
        return userRepository.findAll();
    }

    public void addUser(User user) {
        Optional<User> userOptional = userRepository.findUserByEmail(user.getEmail());
        if (!userOptional.isPresent()){
            userRepository.save(user);
        }else{
            throw new IllegalStateException("This email is taken");
        }

    }

    public void deleteUser(Integer id) {
        if ( userRepository.existsById(id) ){
            userRepository.deleteById(id);
        }else{
            throw new IllegalStateException("No student with id - "+ id);
        }
    }

    public void updateUser(Integer id) {

    }


}
