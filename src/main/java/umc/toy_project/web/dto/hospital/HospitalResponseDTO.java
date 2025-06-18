package umc.toy_project.web.dto.hospital;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

public class HospitalResponseDTO {

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class HospitalPreviewDTO {
        private String name;
        private String address;
    }

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class HospitalPreViewListDTO {
        List<HospitalPreviewDTO> hospitalList;
        Integer listSize;
    }

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class DepartmentPreviewDTO {
        private String name;
        private String phoneNumber;
    }

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class DepartmentPreViewListDTO {
        List<DepartmentPreviewDTO> departmentList;
        Integer listSize;
    }

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class DocterPreviewDTO {
        private String name;
    }

    @Builder
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class DocterPreViewListDTO {
        List<DocterPreviewDTO> docterList;
        Integer listSize;
    }

}
