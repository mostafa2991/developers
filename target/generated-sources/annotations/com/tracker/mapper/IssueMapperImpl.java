package com.tracker.mapper;

import com.tracker.dto.IssueDto;
import com.tracker.entities.Issue;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-04-15T00:33:56+0200",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 15.0.1 (Oracle Corporation)"
)
public class IssueMapperImpl implements IssueMapper {

    @Override
    public Issue dtoToEntity(IssueDto issueDto) {
        if ( issueDto == null ) {
            return null;
        }

        Issue issue = new Issue();

        issue.setTitle( issueDto.getTitle() );
        issue.setDescription( issueDto.getDescription() );
        issue.setCreateDate( issueDto.getCreateDate() );
        issue.setModifyDate( issueDto.getModifyDate() );

        return issue;
    }
}
