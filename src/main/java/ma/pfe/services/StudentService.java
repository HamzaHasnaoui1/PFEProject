package ma.pfe.services;

import ma.pfe.dtos.StudentDto;

import java.util.List;

public interface StudentService {
    Long save (StudentDto dto);
    Long update (StudentDto dto);
    Boolean deletebyid (Long id);

    Boolean delete(Long id);

    List <StudentDto> selectAll ();
}
