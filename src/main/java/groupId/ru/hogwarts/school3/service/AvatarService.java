package groupId.ru.hogwarts.school3.service;
import groupId.ru.hogwarts.school3.model.Avatar;
import groupId.ru.hogwarts.school3.model.Student;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

public interface AvatarService {


    void upload(Long studentId, MultipartFile file) throws IOException;

    Avatar find(Long studentId);

    String saveFile(MultipartFile file, Student student);

    Avatar findAvatar(Long id);

    void uploadAvatar(Long id, MultipartFile avatar);
}