package org.pva.spring.cloud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "CardService", fallback = CardServiceFallback.class)
public interface CardServiceClient {
    @RequestMapping("create")
    String createCard();
}
