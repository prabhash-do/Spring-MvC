package com.spring.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode,String> {

    public String coursePrefix;
    @Override
    public void initialize(CourseCode constraintAnnotation) {
        coursePrefix=constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String code, ConstraintValidatorContext constraintValidatorContext) {

        boolean result;
                if(code!=null) {
                    result = code.startsWith(coursePrefix);
                    return result;
                }
                else
                    return true;
    }
}
