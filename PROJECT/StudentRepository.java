package com.school.repository;

import com.school.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.Optional;

public interface StudentRepository extends MongoRepository<Student, String> {
    Optional<Student> findByName(String name);
    void deleteByName(String name);
}