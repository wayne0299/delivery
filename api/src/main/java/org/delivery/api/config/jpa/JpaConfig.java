package org.delivery.api.config.jpa;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "org.delivery.db")   // 지정 경로의 Entity를 scan 하겠다.
@EnableJpaRepositories(basePackages = "org.delivery.db")
public class JpaConfig {
}
