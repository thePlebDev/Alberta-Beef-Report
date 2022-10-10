package com.RuralBeefReport.Alberta.repositories;

import com.RuralBeefReport.Alberta.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findUserByUsername(String name);

}
