package entity;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContactTest {

    @Test
    public void testCreate(){
        Contact cont = new Contact.Builder()
                .setCellPhone(27749643297L)
                .setHomePhone(0)
                .setEmail("216279585@mycput.ac.za")
                .build();

        System.out.println(cont.toString());
    }

}