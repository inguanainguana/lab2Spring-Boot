package ru.komogorova.MySecondTestAppSpringBoot.exception;

public class ValidationFailed extends Exception {
    public ValidationFailed(String message) { super(message); }
}
