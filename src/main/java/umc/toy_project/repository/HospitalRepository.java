package umc.toy_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.toy_project.domain.Department;
import umc.toy_project.domain.Hospital;

import java.util.List;

public interface HospitalRepository extends JpaRepository<Hospital, Long> {
}
