package umc.toy_project.converter;

import umc.toy_project.domain.Patient;
import umc.toy_project.web.dto.patient.PatientRequestDTO;
import umc.toy_project.web.dto.patient.PatientResponseDTO;

public class PatientConverter {

    public static Patient toPatient(PatientRequestDTO.PostPatientDTO requestDTO) {
        return Patient.builder()
                .name(requestDTO.getName())
                .age(requestDTO.getAge())
                .gender(requestDTO.getGender())
                .build();
    }

    public static PatientResponseDTO.PatientPreviewDTO topatientPreviewDTO(Patient patient) {
        return PatientResponseDTO.PatientPreviewDTO.builder()
                .name(patient.getName())
                .age(patient.getAge())
                .gender(patient.getGender())
                .build();
    }

}
