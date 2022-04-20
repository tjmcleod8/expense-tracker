package edu.tcu.cs.expensetracker.dao;

import edu.tcu.cs.expensetracker.domain.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

public interface ActivityDao extends JpaRepository<Activity, Integer> {
    List<Activity> findAllByCreateTimeBetween(LocalDate startDate, LocalDate endDate);
}
