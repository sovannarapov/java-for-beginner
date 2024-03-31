package org.reankhode.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.reankhode.model.Role;
import org.reankhode.model.User;
import org.reankhode.repository.RoleRepository;
import org.reankhode.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    public void saveUserRole() {
        Role userRole = Role
                .builder()
                .name("ROLE_USER")
                .build();

        Role adminRole = Role
                .builder()
                .name("ROLE_ADMIN")
                .build();

        roleRepository.save(userRole);
        roleRepository.save(adminRole);

        Set<Role> roles = roleRepository.findAllByName("ROLE_ADMIN");

        User user = User.builder()
                .fullName("Rean Khode")
                .username("reankhode")
                .password(passwordEncoder.encode("password"))
                .roles(roles)
                .build();

        userRepository.save(user);
    }

}
