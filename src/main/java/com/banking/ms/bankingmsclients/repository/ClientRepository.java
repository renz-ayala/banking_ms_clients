package com.banking.ms.bankingmsclients.repository;

import com.banking.ms.bankingmsclients.repository.entity.Client;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface ClientRepository extends R2dbcRepository<Client, Long> {
    Mono<Client> findByUniqueId(String uniqueId);
}
