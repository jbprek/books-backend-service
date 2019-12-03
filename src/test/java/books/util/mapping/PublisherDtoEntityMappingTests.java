package books.util.mapping;

import books.persistence.entity.PublisherEntity;
import books.rest.model.PublisherDTO;
import org.junit.Test;
import org.mapstruct.factory.Mappers;

import static org.assertj.core.api.Assertions.assertThat;

public class PublisherDtoEntityMappingTests {

    private DtoEntityMapper mapper = Mappers.getMapper(DtoEntityMapper.class);

    @Test
    public void PublisherEntityToDtoMappingTest() {
        var entity = PublisherEntity.of(1L, "dummy");
        var dto = mapper.entityToDto(entity);
        assertThat(dto).isEqualTo(PublisherDTO.of(1L, "dummy"));
    }

    @Test
    public void PublisherDtoToEntityMappingTest() {
        var dto = PublisherDTO.of(1L, "dummy");
        var entity = mapper.dtoToEntity(dto);
        assertThat(entity).isEqualTo(PublisherEntity.of(1L, "dummy"));
    }

}
