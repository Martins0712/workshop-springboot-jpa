package com.educandoweb.workshorpcourse.repositories;

import com.educandoweb.workshorpcourse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
