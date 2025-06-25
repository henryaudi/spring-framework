package com.shangjie.cruddemo;

import com.shangjie.cruddemo.dao.StudentDAO;
import com.shangjie.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(CruddemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {

        return args -> {
            createMultipleStudents(studentDAO);
        };
    }

    private void createMultipleStudents(StudentDAO studentDAO) {

        // Create multiple students
        System.out.println("Creating new student objects...");
        Student tempStudent1 = new Student("John", "Doe", "jdoe@smu.edu");
        Student tempStudent2 = new Student("Ronald", "Lucas", "rlucas@smu.edu");
        Student tempStudent3 = new Student("Jane", "Mitt", "jmitt@smu.edu");

        // save the student objects
        System.out.println("Saving the students...");
        studentDAO.save(tempStudent1);
        studentDAO.save(tempStudent2);
        studentDAO.save(tempStudent3);
    }

    private void createStudent(StudentDAO studentDAO) {

        // create the student object
        System.out.println("Creating new student object...");
        Student tempStudent = new Student("Paul", "Doe", "pdoe@smu.edu");

        // save the student object
        System.out.println("Saving the student...");
        studentDAO.save(tempStudent);

        // display the id of the saved student
        System.out.println("Saved student: Generated id: " + tempStudent.getId());
    }
}
