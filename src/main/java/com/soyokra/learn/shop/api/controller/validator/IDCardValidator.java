package com.soyokra.learn.shop.api.controller.validator;

import com.soyokra.learn.shop.api.controller.validator.annotation.IDCard;
import com.soyokra.learn.shop.support.utils.IDCardUtils;

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
        return IDCardUtils.valueOf(o).validate();
    }

}
