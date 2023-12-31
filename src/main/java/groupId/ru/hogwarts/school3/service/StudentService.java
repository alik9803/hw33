package groupId.ru.hogwarts.school3.service;

import groupId.ru.hogwarts.school3.model.Faculty;
import groupId.ru.hogwarts.school3.model.Student;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public interface StudentService {
    Student addStudent(Student student);

    Student findStudent(Long id);

    Student editStudent(Long id, Student student);

    void deleteStudent(Long id);

    void getAllStudents();

    Collection<Student> findStudentsByAgeBetween(int min, int max);

    Collection<Student> getStudentsByFaculty(Faculty faculty);

    Student createStudent(Student student);

    Student getById(Long studentId);
}