package studiopractice.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Table(name = "movie")
@Entity
@EntityListeners(AuditingEntityListener.class)
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
    @Column(name = "is_delete")
    private @Getter @Setter int isDelete;
    @CreatedDate
    private @Getter @Setter LocalDateTime createdDate;
    @LastModifiedDate
    private @Getter @Setter LocalDateTime lastModifiedDate;
}
