/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package business;

/**
 *
 * @author Admin
 */
public class Employee {
    
    private String name;
    private int employee_ID;
    private int age;
    private String gender;
    private String start_Date;
    private String level;
    private String team_info;
    private String position_Title;
    private String cellPhoneNumber;
    private String emailAddr;
    private String imageFilePath;

    public Employee(String name, int employee_ID, int age, String gender, String start_Date, String level, String team_info, String position_Title, String cellPhoneNumber, String emailAddr, String imageFilePath) {
        this.name = name;
        this.employee_ID = employee_ID;
        this.age = age;
        this.gender = gender;
        this.start_Date = start_Date;
        this.level = level;
        this.team_info = team_info;
        this.position_Title = position_Title;
        this.cellPhoneNumber = cellPhoneNumber;
        this.emailAddr = emailAddr;
        this.imageFilePath = imageFilePath;
    }

    public Employee() {
        
    }

    public String getImageFilePath() {
        return imageFilePath;
    }

    public void setImageFilePath(String imageFilePath) {
        this.imageFilePath = imageFilePath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployee_ID() {
        return employee_ID;
    }

    public void setEmployee_ID(int employee_ID) {
        this.employee_ID = employee_ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStart_Date() {
        return start_Date;
    }

    public void setStart_Date(String start_Date) {
        this.start_Date = start_Date;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getTeam_info() {
        return team_info;
    }

    public void setTeam_info(String team_info) {
        this.team_info = team_info;
    }

    public String getPosition_Title() {
        return position_Title;
    }

    public void setPosition_Title(String position_Title) {
        this.position_Title = position_Title;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    } 
}
