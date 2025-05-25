package umc.toy_project.domain;

import jakarta.persistence.*;
import lombok.*;
import umc.toy_project.domain.enums.Gender;
import umc.toy_project.domain.mapping.Reservation;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String name;

    private int age;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "VARCHAR(10)")
    private Gender gender;

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private List<Reservation> reservationList = new ArrayList<>();

}
