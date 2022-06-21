package com.anggaari.learnspring.clients;

import lombok.Data;

@Data
public class PaymentGatewayClient {

    private String privateKey;

    private String endpoint;

    private String publicKey;

}
