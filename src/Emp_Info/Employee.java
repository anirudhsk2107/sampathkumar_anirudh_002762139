/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Emp_Info;
//import java.util.Date;
import java.util.Date;
import javax.swing.ImageIcon;


/**
 *
 * @author Anirudh
 */
public class Employee {
    private String name;
    private int empId;
    private int age;
    private char sex;
    private Date strtDate;
    private String level;
    private String teamInfo;
    private String position;
    private String email;
    private long phNmbr;
    private ImageIcon photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public Date getStrtDate() {
        return strtDate;
    }

    public void setStrtDate(Date strtDate) {
        this.strtDate = strtDate;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getTeamInfo() {
        return teamInfo;
    }

    public void setTeamInfo(String teamInfo) {
        this.teamInfo = teamInfo;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhNmbr() {
        return phNmbr;
    }

    public void setPhNmbr(long phNmbr) {
        this.phNmbr = phNmbr;
    }

    public ImageIcon getPhoto() {
        return photo;
    }

    public void setPhoto(ImageIcon photo) {
        this.photo = photo;
    }
    
    @Override
    public String toString(){
        return name;
    }
}