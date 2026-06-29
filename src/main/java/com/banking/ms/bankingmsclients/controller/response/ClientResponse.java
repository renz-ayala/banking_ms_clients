package com.banking.ms.bankingmsclients.controller.response;

public record ClientResponse(
        String names,
        String surnames,
        String documentType,
        String documentNum
){}
