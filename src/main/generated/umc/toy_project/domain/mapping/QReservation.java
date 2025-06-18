package umc.toy_project.domain.mapping;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReservation is a Querydsl query type for Reservation
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QReservation extends EntityPathBase<Reservation> {

    private static final long serialVersionUID = -379552933L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReservation reservation = new QReservation("reservation");

    public final DateTimePath<java.time.LocalDateTime> date = createDateTime("date", java.time.LocalDateTime.class);

    public final umc.toy_project.domain.QDocter docter;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final umc.toy_project.domain.QPatient patient;

    public final EnumPath<umc.toy_project.domain.enums.ReserveStatus> status = createEnum("status", umc.toy_project.domain.enums.ReserveStatus.class);

    public QReservation(String variable) {
        this(Reservation.class, forVariable(variable), INITS);
    }

    public QReservation(Path<? extends Reservation> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReservation(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReservation(PathMetadata metadata, PathInits inits) {
        this(Reservation.class, metadata, inits);
    }

    public QReservation(Class<? extends Reservation> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.docter = inits.isInitialized("docter") ? new umc.toy_project.domain.QDocter(forProperty("docter"), inits.get("docter")) : null;
        this.patient = inits.isInitialized("patient") ? new umc.toy_project.domain.QPatient(forProperty("patient")) : null;
    }

}

