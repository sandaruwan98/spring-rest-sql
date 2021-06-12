//package com.example.springrestsql.User;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import javax.transaction.Transactional;
//import java.util.List;
//import java.util.Objects;
//import java.util.Optional;
//
//@Service
//public class UserService {
//    @Autowired
//    private  UserRepository userRepository;
//
//    List<User> getUsers(){
//        return userRepository.findAll();
//    }
//
//    public void addUser(User user) {
//        Optional<User> userOptional = userRepository.findUserByEmail(user.getEmail());
//        if (!userOptional.isPresent()){
//            userRepository.save(user);
//        }else{
//            throw new IllegalStateException("This email is taken");
//        }
//
//    }
//
//    public void deleteUser(Integer id) {
//        if ( userRepository.existsById(id) ){
//            userRepository.deleteById(id);
//        }else{
//            throw new IllegalStateException("No student with id - "+ id);
//        }
//    }
//
//    @Transactional
//    public void updateUser(Integer id,String name,String email) {
//        User user = userRepository.findById(id).orElseThrow(
//                ()-> new IllegalStateException("Invalid Id")
//        );
//
//        if (name != null && name.length() > 0 && !Objects.equals(name,user.getName() ) ){
//            user.setName(name);
//        }
//
//        if (email != null && email.length() > 0 && !Objects.equals(email,user.getEmail() ) ){
//            if (!userRepository.findUserByEmail(email).isPresent()){
//                user.setEmail(email);
//            }else {
//                throw new IllegalStateException("email is taken");
//            }
//        }
//
//    }
//
//
//    public Optional<User> getUser(Integer id) {
//        if (!userRepository.existsById(id)){
//            throw new IllegalStateException("Invalid id,there is no user with id -"+ id);
//        }
//        return userRepository.findById(id);
//    }
//}
