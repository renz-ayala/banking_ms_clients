package com.banking.ms.bankingmsclients.service.implementation;

import com.banking.ms.bankingmsclients.controller.response.ClientResponse;
import com.banking.ms.bankingmsclients.repository.ClientRepository;
import com.banking.ms.bankingmsclients.repository.mappers.ClientMapper;
import com.banking.ms.bankingmsclients.service.ClientService;
import com.nimbusds.jose.shaded.gson.Gson;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import gg.renz.CryptUtil;

@Slf4j
@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {
    private final CryptUtil cryptUtil;
    private final ClientRepository clientRepository;

    Gson gson = new Gson();

    @Override
    public Mono<ClientResponse> getClientByUniqueId(String uniqueId) {
        String decryptedUniqueId = cryptUtil.decrypt(uniqueId);
        return clientRepository
                .findByUniqueId(decryptedUniqueId)
                .map(client -> {
                    ClientResponse response = ClientMapper.mapClient(client);
                    log.info("Client result: {}", gson.toJson(response));
                    return response;
                });
    }

}
