package com.example.demo.repository;

import com.example.demo.model.UserType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;;

@Repository
public interface UserTypeRepository extends JpaRepository<UserType, Long> {
}
