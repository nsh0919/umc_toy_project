package umc.toy_project.web.controller;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import umc.toy_project.apiPayload.ApiResponse;
import umc.toy_project.converter.PatientConverter;
import umc.toy_project.domain.Patient;
import umc.toy_project.service.PatientService;
import umc.toy_project.web.dto.patient.PatientRequestDTO;
import umc.toy_project.web.dto.patient.PatientResponseDTO;

@RestController
@RequiredArgsConstructor
@Validated
@RequestMapping("/patients")
public class PatientRestController {

    private final PatientService patientService;

    @PostMapping("/")
    @Operation(summary = "환자 등록 API")
    public ApiResponse<PatientResponseDTO.PatientPreviewDTO> postPatient(@Valid @RequestBody PatientRequestDTO.PostPatientDTO request) {
        Patient patient = patientService.addPatient(PatientConverter.toPatient(request));
        return ApiResponse.onSuccess(PatientConverter.topatientPreviewDTO(patient));
    }

}
