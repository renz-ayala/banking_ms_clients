package com.banking.ms.bankingmsclients.service;

import com.banking.ms.bankingmsclients.model.Clients;
import reactor.core.publisher.Mono;

public interface ClientService {
    Mono<Clients> getClientByUniqueId(String uniqueId);
}
