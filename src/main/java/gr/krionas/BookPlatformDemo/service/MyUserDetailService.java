package gr.krionas.BookPlatformDemo.service;

import gr.krionas.BookPlatformDemo.config.UserDetailsImplementation;
import gr.krionas.BookPlatformDemo.model.User;
import gr.krionas.BookPlatformDemo.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipal;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = repo.findByUsername(username);
        if(user== null){
            throw new UsernameNotFoundException("404 User not Found.");
        }


        return new UserDetailsImplementation(user);
    }
}
