package umc.toy_project.converter;

import umc.toy_project.domain.Department;
import umc.toy_project.domain.Docter;
import umc.toy_project.domain.Hospital;
import umc.toy_project.web.dto.hospital.HospitalResponseDTO;

import java.util.List;
import java.util.stream.Collectors;

public class HospitalConverter {

    public static HospitalResponseDTO.HospitalPreviewDTO toHospitalPreviewDTO(Hospital hospital) {
        return HospitalResponseDTO.HospitalPreviewDTO.builder()
                .name(hospital.getName())
                .address(hospital.getAddress())
                .build();
    }

    public static HospitalResponseDTO.HospitalPreViewListDTO toHospitalPreViewListDTO(List<Hospital> hospitalList) {
        List<HospitalResponseDTO.HospitalPreviewDTO> hospitalPreviewDTOList = hospitalList.stream().map(HospitalConverter::toHospitalPreviewDTO).collect(Collectors.toList());
        return HospitalResponseDTO.HospitalPreViewListDTO.builder()
                .hospitalList(hospitalPreviewDTOList)
                .listSize(hospitalPreviewDTOList.size())
                .build();
    }

    public static HospitalResponseDTO.DepartmentPreviewDTO toDepartmentPreviewDTO(Department department) {
        return HospitalResponseDTO.DepartmentPreviewDTO.builder()
                .name(department.getName())
                .phoneNumber(department.getPhoneNumber())
                .build();
    }

    public static HospitalResponseDTO.DepartmentPreViewListDTO toDepartmentPreViewListDTO(List<Department> departmentList) {
        List<HospitalResponseDTO.DepartmentPreviewDTO> departmentPreviewDTOList = departmentList.stream().map(HospitalConverter::toDepartmentPreviewDTO).collect(Collectors.toList());
        return HospitalResponseDTO.DepartmentPreViewListDTO.builder()
                .departmentList(departmentPreviewDTOList)
                .listSize(departmentPreviewDTOList.size())
                .build();
    }

    public static HospitalResponseDTO.DocterPreviewDTO toDocterPreviewDTO(Docter docter) {
        return HospitalResponseDTO.DocterPreviewDTO.builder()
                .name(docter.getName())
                .build();
    }

    public static HospitalResponseDTO.DocterPreViewListDTO toDocterPreViewListDTO(List<Docter> docterList) {
        List<HospitalResponseDTO.DocterPreviewDTO> docterPreviewDTOList = docterList.stream().map(HospitalConverter::toDocterPreviewDTO).collect(Collectors.toList());
        return HospitalResponseDTO.DocterPreViewListDTO.builder()
                .docterList(docterPreviewDTOList)
                .listSize(docterPreviewDTOList.size())
                .build();
    }

}
