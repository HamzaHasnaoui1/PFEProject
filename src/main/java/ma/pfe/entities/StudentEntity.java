package ma.pfe.entities;

import javax.persistence.*;

@Entity
public class StudentEntity {
    @EmbeddedId
    private StudentId StudentId;
    @Column(name = "name_student")
    private String name;

    public StudentId getStudentId() {
        return StudentId;
    }

    public void setStudentId(ma.pfe.entities.StudentId studentId) {
        StudentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "StudentId=" + StudentId +
                ", name='" + name + '\'' +
                '}';
    }
}