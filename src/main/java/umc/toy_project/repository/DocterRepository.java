package umc.toy_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umc.toy_project.domain.Department;
import umc.toy_project.domain.Docter;

import java.util.List;

public interface DocterRepository extends JpaRepository<Docter, Long> {
    List<Docter> findAllByDepartment(Department department);
}
