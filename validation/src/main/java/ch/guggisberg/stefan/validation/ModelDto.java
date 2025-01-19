package ch.guggisberg.stefan.validation;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.time.LocalDate;


@Builder
@Data
@ConsistentDateParameters
@Getter
public class ModelDto {

    private LocalDate end;
    private LocalDate start;

}
