package com.banking.ms.bankingmsclients.service;

import com.banking.ms.bankingmsclients.repository.entity.Client;
import reactor.core.publisher.Mono;

public interface ClientService {
    Mono<Client> getClientByUniqueId(String uniqueId);
}
