package at.htl;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "VISITOR")
public class Visitor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String firstName;
    String lastName;
    String email;
    int telephoneNo;

    Instant timestamp;

}
