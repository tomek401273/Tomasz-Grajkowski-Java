package com.kodilla.kodilla.hibernate.task.dao;

import com.kodilla.kodilla.hibernate.task.Task;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Repository
public interface TaskDao extends CrudRepository<Task, Integer> {
    List<Task> findByDuration(int duration);
    @Query
    List<Task> retriveLongTasks();

    @Query
    List<Task> retriveShortTasks();

    @Query(nativeQuery = true)
    List<Task> retriveTaskWithEnoughtTime();
    @Query
    List<Task> retriveTasksWithDurationLongerThan(@Param("DURATION") int duration);
}
