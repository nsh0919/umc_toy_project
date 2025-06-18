package umc.toy_project.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import umc.toy_project.domain.Department;
import umc.toy_project.domain.Docter;
import umc.toy_project.domain.Hospital;
import umc.toy_project.repository.DepartmentRepository;
import umc.toy_project.repository.DocterRepository;
import umc.toy_project.repository.HospitalRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HospitalService {

    private final HospitalRepository hospitalRepository;
    private final DepartmentRepository departmentRepository;
    private final DocterRepository docterRepository;

    public List<Hospital> getAllHospital(){
        return hospitalRepository.findAll();
    }

    public List<Department> getAllDepartmentOfHospital(Long hospitalId){
        Hospital hospital = hospitalRepository.findById(hospitalId).get();
        return departmentRepository.findAllByHospital(hospital);
    }

    public List<Docter> getAllDocterOfDepartment(Long hospitalId, Long departmentId){
        Hospital hospital = hospitalRepository.findById(hospitalId).get();
        Department department = departmentRepository.findById(departmentId).get();
        return docterRepository.findAllByDepartment(department);
    }


}
