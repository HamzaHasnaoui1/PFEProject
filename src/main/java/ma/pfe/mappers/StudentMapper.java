package ma.pfe.mappers;

import ma.pfe.dtos.StudentDto;
import ma.pfe.entities.StudentEntity;
import ma.pfe.entities.StudentId;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Mapper
public interface StudentMapper {

     StudentEntity studentDtoToEntity(StudentDto dto);
     StudentDto studentEntityToDto(StudentEntity studentEntity);
     List<StudentDto> studentEntiesToDtos(List<StudentEntity> studentEntities) ;
}
