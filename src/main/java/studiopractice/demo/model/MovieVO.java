package studiopractice.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Table(name = "movie")
@Entity
public class MovieVO
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Getter @Setter long id;
    private @Getter @Setter String name;
    private @Getter @Setter String genre;
    private @Getter @Setter int open_date;
    private @Getter @Setter int end_date;
    private @Getter @Setter int is_open;
}
