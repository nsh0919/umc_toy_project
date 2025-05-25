package umc.toy_project.domain.mapping;

import jakarta.persistence.*;
import lombok.*;
import umc.toy_project.domain.Docter;
import umc.toy_project.domain.Patient;
import umc.toy_project.domain.enums.ReserveStatus;

import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime date;

    @Enumerated(EnumType.STRING)
    @Column(columnDefinition = "VARCHAR(15) DEFAULT 'RESERVED'")
    private ReserveStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "docter_id")
    private Docter docter;
}
