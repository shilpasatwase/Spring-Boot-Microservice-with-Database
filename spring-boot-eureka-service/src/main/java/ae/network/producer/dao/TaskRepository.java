package ae.network.producer.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ae.network.producer.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
