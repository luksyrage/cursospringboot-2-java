package com.luksyrage.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.luksyrage.course.entities.User;

public interface UserRepository extends JpaRepository< User, Long>{
	
}
