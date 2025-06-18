package umc.toy_project.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QHospital is a Querydsl query type for Hospital
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QHospital extends EntityPathBase<Hospital> {

    private static final long serialVersionUID = -142227221L;

    public static final QHospital hospital = new QHospital("hospital");

    public final StringPath address = createString("address");

    public final ListPath<Department, QDepartment> departmentList = this.<Department, QDepartment>createList("departmentList", Department.class, QDepartment.class, PathInits.DIRECT2);

    public final ListPath<Docter, QDocter> docterList = this.<Docter, QDocter>createList("docterList", Docter.class, QDocter.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public QHospital(String variable) {
        super(Hospital.class, forVariable(variable));
    }

    public QHospital(Path<? extends Hospital> path) {
        super(path.getType(), path.getMetadata());
    }

    public QHospital(PathMetadata metadata) {
        super(Hospital.class, metadata);
    }

}

