package books.util.mapping;

import books.persistence.entity.PublisherEntity;
import books.rest.model.PublisherDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DtoEntityMapper {

    PublisherDTO entityToDto(PublisherEntity entity);

    PublisherEntity  dtoToEntity( PublisherDTO dto);

}
