package ru.stepagin.gateway;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class LoadBalancerConfig {
    @Bean
    @LoadBalanced // Добавляет поддержку балансировки нагрузки
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    // @LoadBalanced указывает, что RestTemplate будет автоматически использовать Spring Cloud LoadBalancer.
}
