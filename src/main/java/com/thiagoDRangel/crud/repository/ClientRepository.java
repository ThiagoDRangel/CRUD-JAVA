package com.thiagoDRangel.crud.repository;

import com.thiagoDRangel.crud.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
