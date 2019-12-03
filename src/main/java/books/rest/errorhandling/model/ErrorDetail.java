package books.rest.errorhandling.model;

import lombok.Data;

@Data
public class ErrorDetail {
    private String message;
    private String source;
}
