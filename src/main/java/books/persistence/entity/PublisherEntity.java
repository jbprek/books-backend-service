package books.persistence.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "publishers")
@Data
public class PublisherEntity {
    @Id
    @Column(name = "publisher_id")
    private Long id;

    // TODO validation max len = 255
    private String name;
}
