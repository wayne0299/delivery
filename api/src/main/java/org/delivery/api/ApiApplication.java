package org.delivery.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {
    public static void main(String[] args){
        SpringApplication.run(ApiApplication.class, args);  // SpringApplication 에 run 이라는 static 메서드를 호출해서 실행하자.
    }
}
