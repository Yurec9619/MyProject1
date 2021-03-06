package com.sda.java.gda.MyEvents.exeption;

import lombok.Getter;
import org.springframework.validation.BindingResult;

public class BindingResultException extends RuntimeException {
    @Getter
    private BindingResult bindingResult;
    public  BindingResultException (BindingResult bindingResult){
        super();
        this.bindingResult = bindingResult;
    }
}
