package com.banking.ms.bankingmsclients.controller;

import com.banking.ms.bankingmsclients.controller.response.ClientResponse;
import com.banking.ms.bankingmsclients.repository.entity.Client;
import com.banking.ms.bankingmsclients.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("v1/api/clients")
@RequiredArgsConstructor
public class ClientController {

    private final ClientService clientService;

    @GetMapping("/get-client/{uniqueId}")
    public Mono<ResponseEntity<ClientResponse>> getClient(@PathVariable String uniqueId) {
        return clientService.getClientByUniqueId(uniqueId)
                .map(c -> ResponseEntity.ok().body(c))
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }
}
