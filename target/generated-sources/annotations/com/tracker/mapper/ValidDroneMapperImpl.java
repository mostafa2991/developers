package com.tracker.mapper;

import com.tracker.dto.ValidDroneDto;
import com.tracker.entities.Developer;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-03-30T22:14:18+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 15.0.1 (Oracle Corporation)"
)
public class ValidDroneMapperImpl implements ValidDroneMapper {

    @Override
    public ValidDroneDto entityToValidDto(Developer developer) {
        if ( developer == null ) {
            return null;
        }

        ValidDroneDto validDroneDto = new ValidDroneDto();

        validDroneDto.setId( developer.getId() );

        return validDroneDto;
    }

    @Override
    public Developer validDtoToEntity(ValidDroneDto validDroneDto) {
        if ( validDroneDto == null ) {
            return null;
        }

        Developer developer = new Developer();

        developer.setId( validDroneDto.getId() );

        return developer;
    }
}
