package com.example.demo_module4_spring_boot.service.impl;

import com.example.demo_module4_spring_boot.model.AppUser;
import com.example.demo_module4_spring_boot.repository.IAppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailServiceImpl implements UserDetailsService {
    private IAppUserRepository appUserRepository;

    @Autowired
    public UserDetailServiceImpl(IAppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AppUser appUser = this.appUserRepository.findByUserName(username);
        if (appUser == null) {
            System.out.println("User not found! " + username);
            throw new UsernameNotFoundException("User " + username + " was not found in the database");
        }
        System.out.println("Found User: " + appUser);

        List<GrantedAuthority> grantList = new ArrayList<>();
        UserDetails userDetails = new User(appUser.getUserName(), appUser.getEncrytedPassword(), grantList);
        return userDetails;
    }
}
