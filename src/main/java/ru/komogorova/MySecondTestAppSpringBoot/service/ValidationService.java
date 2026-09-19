package ru.komogorova.MySecondTestAppSpringBoot.service;

import org.springframework.validation.BindingResult;
import ru.komogorova.MySecondTestAppSpringBoot.exception.ValidationFailed;

public interface ValidationService {
    void isValid(BindingResult bindingResult) throws ValidationFailed;
}