package edu.tcu.cs.expensetracker.service;

import edu.tcu.cs.expensetracker.dao.ActivityDao;
import edu.tcu.cs.expensetracker.domain.Activity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
public class ActivityService {

    private ActivityDao activityDao;

    public ActivityService(ActivityDao activityDao) {
        this.activityDao = activityDao;
    }

    public List<Activity> findAll() {
        return activityDao.findAll();
    }

    public Activity findById(Integer id) {
        return activityDao.findById(id).get();
    }

    public void save(Activity activity) {
        activityDao.save(activity);
    }

    public void update(Integer id, Activity activity) {
        activity.setId(id);
        activityDao.save(activity);
    }

    public void deleteById(Integer id) {
        activityDao.deleteById(id);
    }

    public List<Activity> findByDate(LocalDate startDate, LocalDate endDate){
        return activityDao.findAllByCreateTimeBetween(startDate, endDate);
    }

}
