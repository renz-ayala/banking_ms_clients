package com.banking.ms.bankingmsclients.service;

import com.banking.ms.bankingmsclients.controller.response.ClientResponse;
import reactor.core.publisher.Mono;

public interface ClientService {
    Mono<ClientResponse> getClientByUniqueId(String uniqueId);
}
