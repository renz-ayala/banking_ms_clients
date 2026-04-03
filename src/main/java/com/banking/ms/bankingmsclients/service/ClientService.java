package com.banking.ms.bankingmsclients.service;

import com.banking.ms.bankingmsclients.model.Client;
import reactor.core.publisher.Mono;

public interface ClientService {
    Mono<Client> getClientByUniqueId(String uniqueId);
}
