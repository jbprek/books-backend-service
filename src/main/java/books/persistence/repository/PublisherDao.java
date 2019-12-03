package books.persistence.repository;

import books.persistence.entity.PublisherEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import javax.validation.constraints.NotNull;

@Transactional
@Service
@AllArgsConstructor
public class PublisherDao {

    private final PublisherRepository repository;

}
