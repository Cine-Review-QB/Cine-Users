package com.quakerish.barbecue.users.api.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<Users, String> {

    Optional<Users> findByAuth0Id(String auth0Id);
    Optional<Users> findByUsername(String username);
    boolean existsByAuth0Id(String auth0Id);
    boolean existsByUsername(String username);
}
