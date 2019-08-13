package ae.network.consumer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import ae.network.consumer.dto.TaskDTO;

@Service
public class TaskServiceImpl {
    public static final String TASK_API = "http://task-service/api/tasks";
    @Autowired
    private RestTemplate restTemplate;

    public List<TaskDTO> findAll() {
        return restTemplate.exchange(TASK_API, HttpMethod.GET, null, new ListOfTaskDTO()).getBody();
    }

    private static class ListOfTaskDTO extends ParameterizedTypeReference<List<TaskDTO>> { }
}
