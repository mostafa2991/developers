package com.tracker.mapper;

import com.tracker.dto.DeveloperDto;
import com.tracker.entities.Developer;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-09T00:57:02+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 15.0.1 (Oracle Corporation)"
)
public class DeveloperMapperImpl implements DeveloperMapper {

    @Override
    public DeveloperDto entityToDto(Developer developer) {
        if ( developer == null ) {
            return null;
        }

        DeveloperDto developerDto = new DeveloperDto();

        developerDto.setName( developer.getName() );

        return developerDto;
    }

    @Override
    public Developer dtoToEntity(DeveloperDto developerDto) {
        if ( developerDto == null ) {
            return null;
        }

        Developer developer = new Developer();

        developer.setName( developerDto.getName() );

        return developer;
    }
}
