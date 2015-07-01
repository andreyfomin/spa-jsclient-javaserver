package com.spa.rest.security;



import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;

import org.springframework.security.core.context.SecurityContextHolder;

import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by AFomin on 7/1/2015.
 */
@RestController
@RequestMapping("/security")
public class ProfileController {
    //    @PreAuthorize("hasRole('PERMISSION_ADMIN')")
    @RequestMapping("/currentUser")
    public User currentUser(@AuthenticationPrincipal User user) {
        Authentication authentication =
                SecurityContextHolder.getContext().getAuthentication();
        return user;
    }
}
