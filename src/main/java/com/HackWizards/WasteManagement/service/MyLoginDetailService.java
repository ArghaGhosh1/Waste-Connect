//package com.HackWizards.WasteManagement.service;
//
//import com.HackWizards.WasteManagement.model.Ragister;
//import com.HackWizards.WasteManagement.model.loginPrincipal;
//import com.HackWizards.WasteManagement.repo.loginRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//
//@Service
//public class MyLoginDetailService implements UserDetailsService
//{
//    @Autowired
//    private loginRepo repo;
//
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
//    {
//        Ragister user = repo.findByUsername(username);
//
//        if(user == null)
//        {
//            System.out.println("user not found");
//            throw new UsernameNotFoundException("user not found");
//        }
//        return new loginPrincipal(user);
//    }
//}
