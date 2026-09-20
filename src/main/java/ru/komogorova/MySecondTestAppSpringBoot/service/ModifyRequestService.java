package ru.komogorova.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.komogorova.MySecondTestAppSpringBoot.model.Request;

@Service
public interface ModifyRequestService {
    void modify(Request request);
}
