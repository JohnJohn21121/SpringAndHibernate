package com.johnjohn21121.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {

    public static void main(String[] args) {

        try{
            ObjectMapper mapper = new ObjectMapper();

            Student student =
                    mapper.readValue(new File("data/sample-full.json"),Student.class);
            Address tempAddress = student.getAddress();

            System.out.println(String.format("First name %s, Last Name %s. \nStudent address, street: %s, city: %s ",
                    student.getFirstName(),student.getLastName(),
                    tempAddress.getStreet(),tempAddress.getCity()));

            for (String languages : student.getLanguages()){
                System.out.println(languages);
            }

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
