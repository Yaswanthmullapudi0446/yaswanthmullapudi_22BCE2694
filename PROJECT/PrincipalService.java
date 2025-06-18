package com.school.service;

import com.school.model.Principal;
import com.school.repository.PrincipalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class PrincipalService {
    @Autowired
    private PrincipalRepository principalRepository;

    public Optional<Principal> getPrincipalByEmail(String email) {
        return principalRepository.findByEmail(email);
    }

    public Principal addPrincipal(Principal principal) {
        return principalRepository.save(principal);
    }
    
    // Other service methods...
}