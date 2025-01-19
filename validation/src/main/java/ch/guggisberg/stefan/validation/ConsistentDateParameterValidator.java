package ch.guggisberg.stefan.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import jakarta.validation.constraintvalidation.SupportedValidationTarget;
import jakarta.validation.constraintvalidation.ValidationTarget;

@SupportedValidationTarget(ValidationTarget.ANNOTATED_ELEMENT)
public class ConsistentDateParameterValidator
        implements ConstraintValidator<ConsistentDateParameters, ModelDto> {
    @Override
    public boolean isValid(ModelDto modelDto, ConstraintValidatorContext constraintValidatorContext) {
        System.out.println("Checking consistent date parameters");
        System.out.println("Checking consistent date parameters");
        System.out.println("Checking consistent date parameters");
        System.out.println("Checking consistent date parameters");
        return false;
    }

//    @Override
//    public boolean isValid(
//
//            Object[] value,
//            ConstraintValidatorContext context) {
//        System.out.println("Checking consistent date parameters");
//        System.out.println("Checking consistent date parameters");
//        System.out.println("Checking consistent date parameters");
//        if (value[0] == null || value[1] == null) {
//            return true;
//        }
//
//        if (!(value[0] instanceof LocalDate)
//                || !(value[1] instanceof LocalDate)) {
//            throw new IllegalArgumentException(
//                    "Illegal method signature, expected two parameters of type LocalDate.");
//        }
//
//        return ((LocalDate) value[0]).isAfter(LocalDate.now())
//                && ((LocalDate) value[0]).isBefore((LocalDate) value[1]);
//    }
}
