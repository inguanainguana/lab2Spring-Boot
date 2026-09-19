package ru.komogorova.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import ru.komogorova.MySecondTestAppSpringBoot.exception.ValidationFailed;

@Service
public class RequestValidationService implements ValidationService {
    @Override
    public void isValid(BindingResult bindingResult) throws ValidationFailed {
        if (bindingResult.hasErrors()) {
            throw new ValidationFailed(bindingResult.getFieldError().toString());
        }
    }
}
