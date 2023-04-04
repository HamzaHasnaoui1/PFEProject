package ma.pfe.services;

import ma.pfe.dtos.StudentDto;
import ma.pfe.dtos.StudentIdDto;

import java.util.List;

public interface StudentService {
    Long save(StudentDto s);

    Long update(StudentDto s);

    Boolean delete(StudentIdDto idDto);

    List<StudentDto> selectAll();

    StudentDto selectById(StudentIdDto idcomp);
}