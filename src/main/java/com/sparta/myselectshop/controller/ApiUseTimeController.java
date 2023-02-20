package com.sparta.myselectshop.controller;

import com.sparta.myselectshop.entity.ApiUseTime;
import com.sparta.myselectshop.entity.UserRoleEnum;
import com.sparta.myselectshop.repository.ApiUseTimeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ApiUseTimeController {

    private final ApiUseTimeRepository apiUseTimeRepository;

    @GetMapping("/api/use/time")
    @Secured(UserRoleEnum.Authority.ADMIN)
    public List<ApiUseTime> getAllApiUseTime() {
        return apiUseTimeRepository.findAll();
    }
}