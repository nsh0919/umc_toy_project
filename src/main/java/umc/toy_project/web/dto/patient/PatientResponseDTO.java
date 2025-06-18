package umc.toy_project.web.dto.patient;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import umc.toy_project.domain.enums.Gender;
import umc.toy_project.web.dto.hospital.HospitalResponseDTO;

import java.util.List;

public class PatientResponseDTO {

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class PatientPreviewDTO {
        private String name;
        private Gender gender;
        private int age;
    }

}
