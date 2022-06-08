package com.soyokra.learn.api.controller.validator;

import com.soyokra.learn.api.controller.validator.annotation.IDCard;
import com.soyokra.learn.support.util.IDCardUtil;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * 身份证验证
 */
public class IDCardValidator implements ConstraintValidator<IDCard, Object> {

    @Override
    public void initialize(IDCard constraintAnnotation) {

    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        return IDCardUtil.valueOf(o).validate();
    }

}
