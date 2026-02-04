package studiopractice.demo.model;

import jakarta.persistence.Column;
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
    @Column(name = "open_date")
    private @Getter @Setter int openDate;
    @Column(name = "end_date")
    private @Getter @Setter int endDate;
    @Column(name = "is_open")
    private @Getter @Setter int isOpen;
}
