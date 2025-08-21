package ucm.tfg.agency.common.utils;

import org.springframework.web.reactive.function.client.WebClient;

public final class ConnectionGateway {
    private ConnectionGateway() {}

    public static WebClient webClient() {
        return WebClient.builder().baseUrl("http://localhost:9001/msa-api-gateway/gateway").build();
    }

}
