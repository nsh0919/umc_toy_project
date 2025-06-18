package umc.toy_project.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import umc.toy_project.domain.Patient;
import umc.toy_project.repository.PatientRepository;

@Service
@RequiredArgsConstructor
public class PatientService {

    public final PatientRepository patientRepository;

    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }

}
