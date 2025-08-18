package com.shangjie.advancedcruddemo;

import com.shangjie.advancedcruddemo.dao.AppDAO;
import com.shangjie.advancedcruddemo.entity.Instructor;
import com.shangjie.advancedcruddemo.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AdvancedcruddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdvancedcruddemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AppDAO appDAO) {

        return runner -> {
//            createInstructor(appDAO);
//            findInstructor(appDAO);
            deleteInstructor(appDAO);
        };
    }

    private void deleteInstructor(AppDAO appDAO) {
        int theId = 2;
        System.out.println("Deleting instructor id: " + theId);

        appDAO.deleteInstructorById(theId);
        System.out.println("Done!");
    }

    private void findInstructor(AppDAO appDAO) {

        int theId = 1;
        System.out.println("Finding instructor with id: " + theId);

        Instructor tempInstructor = appDAO.findInstructorById(theId);

        System.out.println("temp instructor: " + tempInstructor);
        System.out.println("the associated instructorDetail: " + tempInstructor.getInstructorDetail());
    }


    private void createInstructor(AppDAO appDAO) {

        // create the instructor
//        Instructor tempInstructor =
//                new Instructor("Chad", "Darby", "darby@luv2code.com");

        // create the instructor detail
//        InstructorDetail tempInstructorDetail =
//                new InstructorDetail("http://www.luv2code.com/youtube", "Coding");

        // create the instructor
        Instructor tempInstructor =
                new Instructor("Angie", "Smiths", "angies@goldmansachs.com");

        // create the instructor detail
        InstructorDetail tempInstructorDetail =
                new InstructorDetail("http://www.angiepaints.com/youtube", "Painting");

        // associate the objects.
        tempInstructor.setInstructorDetail(tempInstructorDetail);

        // save the instructor
        System.out.println("Saving the instructor: " + tempInstructor);
        appDAO.save(tempInstructor);
        System.out.println("Saving complete!");
    }
}
