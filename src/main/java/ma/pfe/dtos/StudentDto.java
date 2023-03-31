package ma.pfe.dtos;

import java.util.List;

public class StudentDto {

        private StudentIdDto studentId ;
        private String name ;
        private List<CourseDto> courses;
        private AdresseDto adresse;

    public StudentIdDto getStudentId() {
        return studentId;
    }

    public void setStudentId(StudentIdDto studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CourseDto> getCourses() {
        return courses;
    }

    public void setCourses(List<CourseDto> courses) {
        this.courses = courses;
    }

    public AdresseDto getAdresse() {
        return adresse;
    }

    public void setAdresse(AdresseDto adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "StudentDto{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", courses=" + courses +
                ", adresse=" + adresse +
                '}';
    }
}
