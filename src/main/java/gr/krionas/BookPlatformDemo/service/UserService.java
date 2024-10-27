package gr.krionas.BookPlatformDemo.service;

import gr.krionas.BookPlatformDemo.model.User;
import gr.krionas.BookPlatformDemo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * Service class for handling user-related operations.
 * Provides methods to save users with encrypted passwords.
 */
@Service
public class UserService {

    @Autowired
    private UserRepo repo;
    private BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(12);

    //Saves a new user in the database with an encrypted password.
    public User saveUser(User user) {
        user.setPassword(encoder.encode(user.getPassword()));
        return repo.save(user) ;

    }
}
