package books.rest.errorhandling.model;

import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
public class Error {
    private String httpStatus;
    private Instant timestamp;
    private String source;
    private String trace;
    private String span;
    private String message;
    private List<ErrorDetail> details;
}
