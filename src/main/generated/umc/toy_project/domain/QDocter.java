package umc.toy_project.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QDocter is a Querydsl query type for Docter
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QDocter extends EntityPathBase<Docter> {

    private static final long serialVersionUID = -1938599206L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QDocter docter = new QDocter("docter");

    public final NumberPath<Integer> career = createNumber("career", Integer.class);

    public final QDepartment department;

    public final QHospital hospital;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final ListPath<umc.toy_project.domain.mapping.Reservation, umc.toy_project.domain.mapping.QReservation> reservationList = this.<umc.toy_project.domain.mapping.Reservation, umc.toy_project.domain.mapping.QReservation>createList("reservationList", umc.toy_project.domain.mapping.Reservation.class, umc.toy_project.domain.mapping.QReservation.class, PathInits.DIRECT2);

    public QDocter(String variable) {
        this(Docter.class, forVariable(variable), INITS);
    }

    public QDocter(Path<? extends Docter> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QDocter(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QDocter(PathMetadata metadata, PathInits inits) {
        this(Docter.class, metadata, inits);
    }

    public QDocter(Class<? extends Docter> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.department = inits.isInitialized("department") ? new QDepartment(forProperty("department"), inits.get("department")) : null;
        this.hospital = inits.isInitialized("hospital") ? new QHospital(forProperty("hospital")) : null;
    }

}

