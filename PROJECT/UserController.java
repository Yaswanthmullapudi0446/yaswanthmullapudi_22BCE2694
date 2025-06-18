package com.school.controller;

import com.school.payload.request.LoginRequest;
import com.school.payload.request.SignupRequest;
import com.school.payload.response.JwtResponse;
import com.school.payload.response.MessageResponse;
import com.school.security.jwt.JwtUtils;
import com.school.security.services.UserDetailsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class UserController {
    @Autowired
    AuthenticationManager authenticationManager;
    
    @Autowired
    JwtUtils jwtUtils;
    
    // Auth endpoints...
}