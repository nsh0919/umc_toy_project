package umc.toy_project.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String name;

    private String address;

    @OneToMany(mappedBy = "hospital", cascade = CascadeType.ALL)
    private List<Department> departmentList = new ArrayList<>();

    @OneToMany(mappedBy = "hospital", cascade = CascadeType.ALL)
    private List<Docter> docterList = new ArrayList<>();
}
