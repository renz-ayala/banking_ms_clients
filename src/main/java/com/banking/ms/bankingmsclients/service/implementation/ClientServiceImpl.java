package com.banking.ms.bankingmsclients.service.implementation;

import com.banking.ms.bankingmsclients.model.Clients;
import com.banking.ms.bankingmsclients.repository.ClientRepository;
import com.banking.ms.bankingmsclients.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    @Override
    public Mono<Clients> getClientByUniqueId(String uniqueId) {
        return clientRepository.findByUniqueId(uniqueId);
    }

}
