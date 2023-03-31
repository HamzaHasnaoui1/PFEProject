package ma.pfe.services;

import ma.pfe.mappers.StudentMapper;
import ma.pfe.dtos.StudentDto;
import ma.pfe.repositories.StudentRepository;
import org.mapstruct.factory.Mappers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("service1")
public class StudentServiceImpl implements StudentService {
    private final static Logger LOGGER= LoggerFactory.getLogger(StudentServiceImpl.class);

    private StudentRepository studentRepository;
    private StudentMapper studentMapper= Mappers.getMapper(StudentMapper.class);


    public StudentServiceImpl(@Qualifier("repo1") StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Long save(StudentDto dto) {
        LOGGER.debug("start method save dto : {} ",dto);
        StudentDto re = studentMapper.studentEntityToDto(studentRepository.save(studentMapper.studentDtoToEntity(dto)));
        return re.getStudentId().getId();
    }

    @Override
    public Long update(StudentDto dto) {
        LOGGER.debug("start method save dto : {} ",dto);
        StudentDto re = studentMapper.studentEntityToDto(studentRepository.save(studentMapper.studentDtoToEntity(dto)));
        return re.getStudentId().getId();
    }

    @Override
    public Boolean delete(Long id) {
        LOGGER.debug("start method delete id : {} ",id);
        studentRepository.deleteById(id);
        return true;
    }

    @Override
    public List<StudentDto> selectAll() {
        LOGGER.debug("start method select All");
        return studentMapper.studentEntiesToDtos(studentRepository.findAll());
    }

    @Override
    public Boolean deletebyid(Long id) {
        return null;
    }


}