package ma.pfe.mappers;

import ma.pfe.dtos.StudentDto;
import ma.pfe.dtos.StudentIdDto;
import ma.pfe.entities.StudentEntity;
import ma.pfe.entities.StudentId;
import org.mapstruct.Mapper;

import java.util.List;


@Mapper
public interface StudentMapper {

    public StudentEntity studentDtoToEntity(StudentDto dto);
    public StudentDto studentEntityToDto(StudentEntity studentEntity) ;
    public List<StudentDto> studentEntiesToDtos(List<StudentEntity> studentEntities);
    public StudentId studentIdDtoToStudentId(StudentIdDto studentIdDTO);

}
