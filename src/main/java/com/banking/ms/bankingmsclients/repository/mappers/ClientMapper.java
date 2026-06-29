package com.banking.ms.bankingmsclients.repository.mappers;

import com.banking.ms.bankingmsclients.controller.response.ClientResponse;
import com.banking.ms.bankingmsclients.repository.entity.Client;

public class ClientMapper {
    public static ClientResponse mapClient(Client client){
        return new ClientResponse(
                client.getNames(),
                client.getSurnames(),
                client.getDocumentType(),
                client.getDocumentNum()
        );
    }
}
