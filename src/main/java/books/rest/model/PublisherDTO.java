package books.rest.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
public class PublisherDTO {
   @NotNull
    private Long id;

    private String name;
}
