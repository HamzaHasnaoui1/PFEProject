package ma.pfe.controllers;

import ma.pfe.dtos.StudentDto;
import ma.pfe.dtos.StudentIdDto;
import ma.pfe.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final static Logger LOGGER= LoggerFactory.getLogger(StudentController.class);

    private StudentService studentService;

    public StudentController(@Qualifier("service1") StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public Long save(@RequestBody  StudentDto dto) {
        LOGGER.debug("start method save dto : {} ",dto);
        return studentService.save(dto);
    }

    @PutMapping
    public Long update(@RequestBody StudentDto dto) {
        LOGGER.debug("start method update dto : {} ",dto);
        return studentService.update(dto);
    }

    @DeleteMapping("/{id}/{code}")
    public Boolean deleteById(@PathVariable("id") long id,@PathVariable("code") String code) {
        LOGGER.debug("start method select by id {} , code {} ",id,code);
        StudentIdDto idcomp =new StudentIdDto(id,code);
        return studentService.delete(idcomp);
    }

    @GetMapping
    public List<StudentDto> selectAll() {
        LOGGER.debug("start method select All");
        return studentService.selectAll();
    }
    @GetMapping("/{id}/{code}")
    public StudentDto selectById(@PathVariable("id") long id,@PathVariable("code") String code) {
        LOGGER.debug("start method select by id {} , code {} ",id,code);
        StudentIdDto idcomp =new StudentIdDto(id,code);
        return studentService.selectById(idcomp);
    }

}