package com.tracker.mapper;

import com.tracker.dto.MedicationDto;
import com.tracker.entities.Medication;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-09T00:57:02+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 15.0.1 (Oracle Corporation)"
)
public class MedicationMapperImpl implements MedicationMapper {

    @Override
    public MedicationDto entityToDto(Medication medication) {
        if ( medication == null ) {
            return null;
        }

        MedicationDto medicationDto = new MedicationDto();

        medicationDto.setName( medication.getName() );
        medicationDto.setWeight( medication.getWeight() );
        medicationDto.setCode( medication.getCode() );
        medicationDto.setImageUrl( medication.getImageUrl() );

        return medicationDto;
    }

    @Override
    public Medication dtoToEntity(MedicationDto medicationDto) {
        if ( medicationDto == null ) {
            return null;
        }

        Medication medication = new Medication();

        medication.setName( medicationDto.getName() );
        medication.setWeight( medicationDto.getWeight() );
        medication.setCode( medicationDto.getCode() );
        medication.setImageUrl( medicationDto.getImageUrl() );

        return medication;
    }
}
