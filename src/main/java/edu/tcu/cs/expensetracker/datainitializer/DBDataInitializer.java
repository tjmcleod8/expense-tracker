package edu.tcu.cs.expensetracker.datainitializer;

import edu.tcu.cs.expensetracker.dao.ActivityDao;
import edu.tcu.cs.expensetracker.domain.Activity;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DBDataInitializer implements CommandLineRunner {

    ActivityDao activityDao;

    public DBDataInitializer(ActivityDao activityDao) {
        this.activityDao = activityDao;
    }

    @Override
    public void run(String... args) throws Exception{
        Activity a1 = new Activity();
        a1.setName("Fort Worth Marathon");
        a1.setDescription("Marathon through the city");
        a1.setMoney(1000.00);
        a1.setCreateTime(LocalDate.of(2022,5,15));
        a1.setAccount("City of Fort Worth");

        Activity a2 = new Activity();
        a2.setName("TCU Christmas Tree Lighting");
        a2.setDescription("Christmas tree lighting in the commons");
        a2.setMoney(10000.00);
        a2.setCreateTime(LocalDate.of(2022,12,5));
        a2.setAccount("TCU");

        Activity a3 = new Activity();
        a3.setName("Senior Design Presentations");
        a3.setDescription("computer science senior project presentations");
        a3.setMoney(5000.00);
        a3.setCreateTime(LocalDate.of(2022,4,28));
        a3.setAccount("TCU Computer Science");

        Activity a4 = new Activity();
        a4.setName("Graduation");
        a4.setDescription("graduation at TCU");
        a4.setMoney(2000.00);
        a4.setCreateTime(LocalDate.of(2022,5,8));
        a4.setAccount("TCU");

        Activity a5 = new Activity();
        a5.setName("Birthday Party");
        a5.setDescription("House party");
        a5.setMoney(100.00);
        a5.setCreateTime(LocalDate.of(2022,5,11));
        a5.setAccount("Tyler");

        activityDao.save(a1);
        activityDao.save(a2);
        activityDao.save(a3);
        activityDao.save(a4);
        activityDao.save(a5);
    }
}
