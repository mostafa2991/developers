package com.tracker.service;

import com.tracker.dto.DeveloperDto;
import com.tracker.entities.Developer;
import com.tracker.exceptions.GenericExceptionResponse;
import com.tracker.exceptions.NotFoundException;
import com.tracker.mapper.DeveloperMapper;
import com.tracker.repositories.DeveloperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class DeveloperServiceImpl implements DeveloperService {


    @Autowired
    private DeveloperRepository developerRepository;

    @Override
    public List<DeveloperDto> getAllDevelopers() {
        List<DeveloperDto> developerDtos = Optional.ofNullable(developerRepository.findAll())
                .map(entities -> entities.stream().map(DeveloperMapper.INSTANCE::entityToDto)
                .collect(Collectors.toList())).orElseThrow(() -> new NotFoundException("No developers Available."));
        return developerDtos;
    }

    @Override
    public DeveloperDto getDeveloperByName(String name) {
        Developer developer = Optional.ofNullable(developerRepository.findByName(name))
                                      .orElseThrow(() -> new NotFoundException("can't find developer with name: " + name));
        DeveloperDto developerDto = DeveloperMapper.INSTANCE.entityToDto(developer);
        return developerDto;
    }

    @Override
    public DeveloperDto updateDeveloper(String name, DeveloperDto developerDto) {
        Developer developer = Optional.ofNullable(developerRepository.findByName(name))
                .orElseThrow(() -> new NotFoundException("can't find developer with name: " + name));
        developer = DeveloperMapper.INSTANCE.dtoToEntity(developerDto);
        Developer updateDeveloper = developerRepository.save(developer);
        return DeveloperMapper.INSTANCE.entityToDto(updateDeveloper);
    }

    @Override
    public String deleteDeveloperByName(String name) {
        Developer developer = Optional.ofNullable(developerRepository.findByName(name))
                                      .orElseThrow(() -> new NotFoundException("can't find developer with name: " + name));
        developerRepository.deleteByName(name);
        return "success deleted customer with name " + name;
    }

    @Override
    public DeveloperDto addDeveloper(DeveloperDto developerDto) {
        Developer existedDeveloper = developerRepository.findByName(developerDto.getName());
        if (Objects.nonNull(existedDeveloper))
            throw new GenericExceptionResponse("The developer with name " + developerDto.getName() + " already exist");
        existedDeveloper = DeveloperMapper.INSTANCE.dtoToEntity(developerDto);
        Developer savedDeveloper = developerRepository.save(existedDeveloper);
        return DeveloperMapper.INSTANCE.entityToDto(savedDeveloper);
    }



}
