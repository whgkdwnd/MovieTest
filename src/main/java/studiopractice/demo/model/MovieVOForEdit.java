package studiopractice.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

public class MovieVOForEdit {
    private @Getter @Setter String name;
    private @Getter @Setter String genre;
    private @Getter @Setter int openDate;
    private @Getter @Setter int endDate;
    private @Getter @Setter int isOpen;
}
