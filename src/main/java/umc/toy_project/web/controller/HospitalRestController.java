package umc.toy_project.web.controller;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import umc.toy_project.apiPayload.ApiResponse;
import umc.toy_project.converter.HospitalConverter;
import umc.toy_project.domain.Department;
import umc.toy_project.domain.Docter;
import umc.toy_project.domain.Hospital;
import umc.toy_project.service.HospitalService;
import umc.toy_project.web.dto.hospital.HospitalResponseDTO;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Validated
@RequestMapping("/hospitals")
class HospitalRestController {

    private final HospitalService hospitalService;

    @GetMapping("/")
    @Operation(summary = "병원 목록 조회 API")
    public ApiResponse<HospitalResponseDTO.HospitalPreViewListDTO> getHospitalList() {
        List<Hospital> hospitals = hospitalService.getAllHospital();
        return ApiResponse.onSuccess(HospitalConverter.toHospitalPreViewListDTO(hospitals));
    }

    @GetMapping("/{hospital_Id}/departments")
    @Operation(summary = "진료과 조회 API")
    public ApiResponse<HospitalResponseDTO.DepartmentPreViewListDTO> getDepartmentList(@PathVariable("hospital_Id") Long hospitalId) {
        List<Department> departments = hospitalService.getAllDepartmentOfHospital(hospitalId);
        return ApiResponse.onSuccess(HospitalConverter.toDepartmentPreViewListDTO(departments));
    }

    @GetMapping("/{hospital_Id}/departments/{department_Id}/doctors")
    @Operation(summary = "의사 조회 API")
    public ApiResponse<HospitalResponseDTO.DocterPreViewListDTO> getDocterList(@PathVariable("hospital_Id") Long hospitalId, @PathVariable("department_Id") Long departmentId) {
        List<Docter> docters = hospitalService.getAllDocterOfDepartment(hospitalId, departmentId);
        return ApiResponse.onSuccess(HospitalConverter.toDocterPreViewListDTO(docters));
    }

}


