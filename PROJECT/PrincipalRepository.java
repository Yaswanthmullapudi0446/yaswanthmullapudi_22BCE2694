package com.school.repository;

import com.school.model.Principal;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface PrincipalRepository extends MongoRepository<Principal, String> {
    Optional<Principal> findByEmail(String email);
    void deleteByEmail(String email);
}