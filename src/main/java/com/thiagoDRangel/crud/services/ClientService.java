package com.thiagoDRangel.crud.services;

import com.thiagoDRangel.crud.dto.ClientDTO;
import com.thiagoDRangel.crud.entities.Client;
import com.thiagoDRangel.crud.repository.ClientRepository;
import com.thiagoDRangel.crud.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Client client = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Recurso não encontrado")
        );
        return new ClientDTO(client);
    }
}
