package umc.toy_project.web.dto.patient;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import umc.toy_project.domain.enums.Gender;

public class PatientRequestDTO {

    @Getter
    public static class PostPatientDTO {

        @NotBlank
        private String name;
        @NotNull
        private int age;
        @NotNull
        private Gender gender;
    }

}
