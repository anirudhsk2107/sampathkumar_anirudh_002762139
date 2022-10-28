/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Person_Info;

import java.util.ArrayList;

/**
 *
 * @author Anirudh
 */
public class PersonDirectory {
    
    private static ArrayList<Person> personList;

    public PersonDirectory(){
        this.personList  = new ArrayList<Person>();
        
        Person person = new Person();
        
        person.setUserName("sysadmin");
        person.setPassword("sysadmin");
        person.setId(1);
        person.setRole("SysAdmin");
        person.setEmail("sysadmin@gmail.com");
        person.setGender("Male");
        personList.add(person);
        
        //Test Data
        person = new Person();
        person.setUserName("hospadmin");
        person.setPassword("hospadmin");
        person.setId(2);
        person.setRole("HospAdmin");
        person.setEmail("hospadmin@gmail.com");
        person.setGender("Female");
        personList.add(person);
        
        person = new Person();
        person.setUserName("commadmin");
        person.setPassword("commadmin");
        person.setId(3);
        person.setRole("CommAdmin");
        person.setEmail("commadmin@gmail.com");
        person.setGender("Male");
        personList.add(person);
    }
    
    public static ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    public Person AddNewPerson(Person newPerson){
        //Person newPerson = new Person();
        personList.add(newPerson);
        return newPerson;
    }
    
    public void DeletePerson(Person person){
        personList.remove(person);
    }
}
