package com.eatpizzaquickly.userservice.common.config;


import com.eatpizzaquickly.userservice.entity.User;
import com.eatpizzaquickly.userservice.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        User user = userRepository.findByEmailOrElseThrow(email);


        // User 엔티티를 기반으로 CustomUserDetails 객체 반환
        return new CustomUserDetails(user);
    }
}
