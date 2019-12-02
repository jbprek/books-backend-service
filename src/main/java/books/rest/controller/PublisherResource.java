package books.rest.controller;

import books.persistence.entity.PublisherEntity;
import books.persistence.repository.PublisherRepository;
import books.rest.model.PublisherDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/publishers",
        produces = "application/json")
public class PublisherResource {

    private PublisherRepository repository;

    @GetMapping
    public List<PublisherDTO> listAll(){
        List<PublisherEntity> entities = repository.findAll();
        return null;
    }
    
}
