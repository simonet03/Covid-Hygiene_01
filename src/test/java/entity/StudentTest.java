package entity;

import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testCreate(){
        Student stud = new Student.Builder()
                .setStudentNum(216279585)
                .setFirstName("Damien")
                .setLastName("Mally")
                .setAddress("Cput, Cape Town, 1234")
                .build();

        System.out.println(stud.toString());
    }

}