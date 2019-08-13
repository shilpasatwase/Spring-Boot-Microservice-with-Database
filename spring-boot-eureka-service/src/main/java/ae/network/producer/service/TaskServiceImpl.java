package ae.network.producer.service;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ae.network.producer.dao.TaskRepository;
import ae.network.producer.dto.TaskDTO;

@Service
public class TaskServiceImpl {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private TaskRepository repository;

    public List<TaskDTO> findAll() {
        logger.info("Task service is being called");
        return repository.findAll().stream()
            .map(entity -> new TaskDTO(entity.getId(), entity.getTask(), entity.isCompleted()))
            .collect(Collectors.toList());
    }
}
