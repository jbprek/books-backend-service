package books.rest.controller;

import books.persistence.entity.PublisherEntity;
import books.persistence.repository.PublisherRepository;
import books.rest.model.PublisherDTO;
import books.util.mapping.DtoEntityMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataRetrievalFailureException;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/publishers",
        produces = "application/json")
@Validated
@AllArgsConstructor
public class PublisherResource {

    private PublisherRepository repository;
    private DtoEntityMapper mapper;

    @GetMapping
    public List<PublisherDTO> listAll() {
        List<PublisherEntity> entities = repository.findAll();
        return entities.stream()
                .map(mapper::entityToDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public PublisherDTO getById(@PathVariable("id") @Min(Long.MIN_VALUE) @Max(Long.MAX_VALUE) Long id) {
        Optional<PublisherEntity> entity = repository.findById(id);
        return entity.map(mapper::entityToDto).orElseThrow(()->new DataRetrievalFailureException("No Publisher with id:"+id));
    }

}
