package studiopractice.demo.model;

import lombok.Getter;
import lombok.Setter;



public class MovieVO
{
    private @Getter @Setter String name;
    private @Getter @Setter String genre;
    private @Getter @Setter int open_date;
    private @Getter @Setter int end_date;
    private @Getter @Setter int is_open;
}
