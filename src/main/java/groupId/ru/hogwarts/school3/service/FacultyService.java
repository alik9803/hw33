package groupId.ru.hogwarts.school3.service;

import groupId.ru.hogwarts.school3.model.Faculty;
import groupId.ru.hogwarts.school3.model.Student;

import java.util.Collection;

public interface FacultyService {
    Faculty addFaculty(Faculty faculty);

    Faculty findFaculty(Long id);

    Faculty editFaculty(Long id, Faculty faculty);

    void deleteFaculty(Long id);

    Collection<Faculty> findFacultiesByNameOrColor(String name, String color);

    Faculty getFacultyByStudent(Student student);

}