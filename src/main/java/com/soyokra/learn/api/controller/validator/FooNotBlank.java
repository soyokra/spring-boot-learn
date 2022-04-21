package com.soyokra.learn.api.controller.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = {FooNotBlankValidator.class}) // 标明由哪个类执行校验逻辑
public @interface FooNotBlank {
    // 校验出错时默认返回的消息
    String message() default "y参数不能为空";
    //分组校验
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
