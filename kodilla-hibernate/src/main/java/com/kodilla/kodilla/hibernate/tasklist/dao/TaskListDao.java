package com.kodilla.kodilla.hibernate.tasklist.dao;

import com.kodilla.kodilla.hibernate.tasklist.TaskList;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TaskListDao extends CrudRepository<TaskList, Integer> {
    List<TaskList> findByListName(String listName);
}
