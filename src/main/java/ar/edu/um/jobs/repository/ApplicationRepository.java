package ar.edu.um.jobs.repository;

import ar.edu.um.jobs.model.Application;
import ar.edu.um.jobs.model.Job;
import ar.edu.um.jobs.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long> {

    List<Application> findByJob(Job job);

    List<Application> findByDeveloper(User developer);
}
