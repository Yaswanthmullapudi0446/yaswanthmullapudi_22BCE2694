package com.school.controller;

import com.school.model.Principal;
import com.school.service.PrincipalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/principals")
@CrossOrigin(origins = "*")
public class PrincipalController {
    @Autowired
    private PrincipalService principalService;

    @GetMapping("/email/{email}")
    public ResponseEntity<Principal> getPrincipalByEmail(@PathVariable String email) {
        return principalService.getPrincipalByEmail(email)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    
    // Other endpoints...
}