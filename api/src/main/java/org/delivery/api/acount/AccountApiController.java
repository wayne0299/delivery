package org.delivery.api.acount;

import lombok.RequiredArgsConstructor;
import org.delivery.api.acount.model.AccountMeResponse;
import org.delivery.api.common.api.Api;
import org.delivery.api.common.error.UserErrorCode;
import org.delivery.db.account.AccountEntity;
import org.delivery.db.account.AccountRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.time.LocalDateTime;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/account")
public class AccountApiController {

    private final AccountRepository accountRepository;

    @GetMapping("/me")
    public Api<Object> me() {
        var response = AccountMeResponse.builder()
                .name("wayne")
                .email("wayne@wayne.com")
                .registeredAt(LocalDateTime.now())
                .build();

//        return Api.ERROR(UserErrorCode.USER_NOT_FOUND, "way 라는 사용자 없음.");
        return Api.OK(response);
    }
}