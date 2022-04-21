package com.soyokra.learn.api.controller.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 自定义参数验证
 */
public class FooNotBlankValidator implements ConstraintValidator<FooNotBlank, Object> {
    @Override
    public void initialize(FooNotBlank constraintAnnotation) {

    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        return false;
    }
}
