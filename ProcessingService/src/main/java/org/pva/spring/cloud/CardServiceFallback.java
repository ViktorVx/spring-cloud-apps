package org.pva.spring.cloud;

import org.springframework.stereotype.Component;

@Component
public class CardServiceFallback implements CardServiceClient {
    @Override
    public String createCard() {
        return null;
    }
}
