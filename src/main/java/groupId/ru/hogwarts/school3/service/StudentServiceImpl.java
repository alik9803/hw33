package groupId.ru.hogwarts.school3.service;

import groupId.ru.hogwarts.school3.model.Faculty;
import groupId.ru.hogwarts.school3.model.Student;
import groupId.ru.hogwarts.school3.repository.StudentRepository;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Collection<Student> findStudentsByAgeBetween(int min, int max) {
        return studentRepository.findByAgeBetween(min, max);
    }

    public Collection<Student> getStudentsByFaculty(Faculty faculty) {
        return studentRepository.findByFaculty(faculty);
    }

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getById(Long studentId) {
        return null;
    }

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student findStudent(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public Student editStudent(Long id, Student student) {
        return studentRepository.findById(id)
                .map(foundStudent -> {
                    foundStudent.setName(student.getName());
                    foundStudent.setAge(student.getAge());
                    foundStudent.setFaculty(student.getFaculty());
                    return studentRepository.save(foundStudent);
                })
                .orElseThrow(() -> new ResourceNotFoundException("Student not found with id: " + id));
    }

    @Override
    public void deleteStudent(Long id) {

    }

    @Override
    public void getAllStudents() {

    }
}