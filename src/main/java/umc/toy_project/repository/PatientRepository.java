package umc.toy_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.toy_project.domain.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
