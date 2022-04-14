package com.tracker.service;

import com.tracker.dto.DeveloperDto;
import com.tracker.dto.IssueDto;
import com.tracker.entities.Developer;
import com.tracker.entities.Issue;
import com.tracker.enums.IssueType;
import com.tracker.exceptions.GenericExceptionResponse;
import com.tracker.exceptions.NotFoundException;
import com.tracker.mapper.DeveloperMapper;
import com.tracker.mapper.IssueMapper;
import com.tracker.repositories.DeveloperRepository;
import com.tracker.repositories.IssueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class IssueServiceImpl implements IssueService {


    @Autowired
    private IssueRepository issueRepository;
//    change
    @Autowired
    private DeveloperRepository developerRepository;
    @Autowired
    IssueTypeService issueTypeService;

    @Override
    public List<IssueDto> getAllIssues() {
        List<IssueDto> issuesDtos = Optional.ofNullable(issueRepository.findAll())
                .map(entities -> entities.stream().map(IssueMapper.INSTANCE::entityToDto)
                .collect(Collectors.toList())).orElseThrow(() -> new NotFoundException("No issues Available."));
        return issuesDtos;
    }

    @Override
    public Issue getIssueById(Integer id) {
        return null;
    }

    @Override
    public Issue updateIssue(String name, Issue issue) {
        return null;
    }

    @Override
    public String deleteDeveloperByName(Integer id) {
        return null;
    }

    @Override
    public IssueDto addIssue(IssueDto issueDto) {

//        issueTypeService.getIssueType(issueDto.getIssueType());
//
//
//        IssueDto issue1 = new IssueDto();
//        issue1.setTitle("lolo");
//        issue1.setDescription("lolo");
//        issue1.setCreateDate(new Date());
//        issue1.setModifyDate(new Date());
//        issue1.setTitle("lolo");
//        issue1.setDeveloperId(1);
//        issue1.setIssueType(IssueType.BUG);
//
//        Issue newIssue = IssueMapper.INSTANCE.dtoToEntity(issue1);
//        Developer dev = developerRepository.findByName("dev1");
//        newIssue.setDeveloper(dev);
//
//        newIssue= issueRepository.save(newIssue);
//
//
//
//
//        return IssueMapper.INSTANCE.entityToDto(newIssue);
        return null;
    }

//    public DeveloperDto addDeveloper(DeveloperDto developerDto) {
//        Developer existedDeveloper = developerRepository.findByName(developerDto.getName());
//        if (Objects.nonNull(existedDeveloper))
//            throw new GenericExceptionResponse("The developer with name " + developerDto.getName() + " already exist");
//        existedDeveloper = DeveloperMapper.INSTANCE.dtoToEntity(developerDto);
//        Developer savedDeveloper = developerRepository.save(existedDeveloper);
//        return DeveloperMapper.INSTANCE.entityToDto(savedDeveloper);
//    }




//    @Override
//    public DeveloperDto getDeveloperByName(String name) {
//        Developer developer = Optional.ofNullable(developerRepository.findByName(name))
//                                      .orElseThrow(() -> new NotFoundException("can't find developer with name: " + name));
//        DeveloperDto developerDto = DeveloperMapper.INSTANCE.entityToDto(developer);
//        return developerDto;
//    }
//
//    @Override
//    public DeveloperDto updateDeveloper(String name, DeveloperDto developerDto) {
//        Developer developer = Optional.ofNullable(developerRepository.findByName(name))
//                .orElseThrow(() -> new NotFoundException("can't find developer with name: " + name));
//        developer = DeveloperMapper.INSTANCE.dtoToEntity(developerDto);
//        Developer updateDeveloper = developerRepository.save(developer);
//        return DeveloperMapper.INSTANCE.entityToDto(updateDeveloper);
//    }
//
//    @Override
//    public String deleteDeveloperByName(String name) {
//        Developer developer = Optional.ofNullable(developerRepository.findByName(name))
//                                      .orElseThrow(() -> new NotFoundException("can't find developer with name: " + name));
//        developerRepository.deleteByName(name);
//        return "success deleted customer with name " + name;
//    }
//




}
