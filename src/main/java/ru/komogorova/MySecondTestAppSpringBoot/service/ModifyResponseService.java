package ru.komogorova.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.komogorova.MySecondTestAppSpringBoot.model.Response;

@Service
public interface ModifyResponseService {
    Response modify(Response response);
}