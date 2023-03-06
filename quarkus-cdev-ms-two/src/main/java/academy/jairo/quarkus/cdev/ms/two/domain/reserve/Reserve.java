package academy.jairo.quarkus.cdev.ms.two.domain.reserve;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class Reserve extends PanacheEntity {

    public long idClient;

}
