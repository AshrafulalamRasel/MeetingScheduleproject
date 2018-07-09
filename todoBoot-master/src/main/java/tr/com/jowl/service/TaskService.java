package tr.com.jowl.service;

import org.springframework.data.jpa.repository.Query;
import tr.com.jowl.model.Task;

import java.util.List;

/**
 * The GlobalController  Class
 *
 * @Ashraful Alam Rasel
 * @version 1.0
 * Date 7/10/2018.
 */
public interface TaskService {

    Task save(Task task);

    Boolean delete(int id);

    Task update(Task task);

    Task findById(int id);

    List<Task> findAll();

    List<Task> findByStatus(String status);

    List<Task> findByUserIdStatus(int userId, String status);

    List<Task> findBetween(int start, int end);

}
