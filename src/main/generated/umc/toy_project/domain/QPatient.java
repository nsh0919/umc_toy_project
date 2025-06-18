package umc.toy_project.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPatient is a Querydsl query type for Patient
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPatient extends EntityPathBase<Patient> {

    private static final long serialVersionUID = 1707640372L;

    public static final QPatient patient = new QPatient("patient");

    public final NumberPath<Integer> age = createNumber("age", Integer.class);

    public final EnumPath<umc.toy_project.domain.enums.Gender> gender = createEnum("gender", umc.toy_project.domain.enums.Gender.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final ListPath<umc.toy_project.domain.mapping.Reservation, umc.toy_project.domain.mapping.QReservation> reservationList = this.<umc.toy_project.domain.mapping.Reservation, umc.toy_project.domain.mapping.QReservation>createList("reservationList", umc.toy_project.domain.mapping.Reservation.class, umc.toy_project.domain.mapping.QReservation.class, PathInits.DIRECT2);

    public QPatient(String variable) {
        super(Patient.class, forVariable(variable));
    }

    public QPatient(Path<? extends Patient> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPatient(PathMetadata metadata) {
        super(Patient.class, metadata);
    }

}

