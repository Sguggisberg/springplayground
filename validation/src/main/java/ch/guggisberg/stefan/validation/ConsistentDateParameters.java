package ch.guggisberg.stefan.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Constraint(validatedBy = ConsistentDateParameterValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ConsistentDateParameters {

    String message() default
            "Error Message";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
