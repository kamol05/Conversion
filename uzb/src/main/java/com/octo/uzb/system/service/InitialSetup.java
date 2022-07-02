package com.octo.uzb.system.service;


import com.octo.uzb.system.model.Role;
import com.octo.uzb.system.model.User;
import com.octo.uzb.system.repository.UserRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;


@Component
public class InitialSetup implements ApplicationListener<ContextRefreshedEvent> {
    private final PasswordEncoder bcryptEncoder;
    private final UserRepository userRepository;
    public InitialSetup(PasswordEncoder bcryptEncoder, UserRepository userRepository) {
        this.bcryptEncoder = bcryptEncoder;
        this.userRepository = userRepository;
    }


    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        User admin = new User();
        admin.setLogin("SuperAdmin");
        admin.setPassword(bcryptEncoder.encode("SuperAdmin"));
        admin.setRole(Role.ADMIN);

        User user = new User();
        user.setLogin("user");
        user.setPassword(bcryptEncoder.encode("user"));
        user.setRole(Role.USER);

        User user1 = new User();
        user1.setLogin("user1");
        user1.setPassword(bcryptEncoder.encode("user"));
        user1.setRole(Role.USER);

        User user2 = new User();
        user2.setLogin("user2");
        user2.setPassword(bcryptEncoder.encode("user"));
        user2.setRole(Role.USER);

        userRepository.save(admin);
        userRepository.save(user);
        userRepository.save(user1);
        userRepository.save(user2);

    }

}
