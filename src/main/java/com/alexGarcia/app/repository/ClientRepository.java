package com.alexGarcia.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alexGarcia.app.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
