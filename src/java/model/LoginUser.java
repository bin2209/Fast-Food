package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginUser implements Comparable<LoginUser> {
    private int userID;
    private String userEmail;
    private String userPass;
    private String userFullName;
    private char userSex;
    private Date userBirthDay;

    public LoginUser() {
    }

    
    
//    public LoginUser(int userID, String userEmail, String userPass, String userFullName, char userSex, String userBirthDay) {
//        this.userID = userID;
//        this.userEmail = userEmail;
//        this.userPass = userPass;
//        this.userFullName = userFullName;
//        this.userSex = userSex;
//
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        try {
//            this.userBirthDay = sdf.parse(userBirthDay);
//        } catch (ParseException ex) {
//            Logger.getLogger(LoginUser.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

    
    
//    public LoginUser() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

    public LoginUser(int userID, String userEmail, String userPass, String userFullName, char userSex, Date userBirthDay) {
        this.userID = userID;
        this.userEmail = userEmail;
        this.userPass = userPass;
        this.userFullName = userFullName;
        this.userSex = userSex;
        this.userBirthDay = userBirthDay;
    }
    
    


    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserFullName() {
        return userFullName;
    }

    public void setUserFullName(String userFullName) {
        this.userFullName = userFullName;
    }

    public String getUserSex() {
        switch (userSex) {
            case 'M':
                return "Male";
            case 'F':
                return "Female";
            case 'L':
                return "Lesbian";
            default:
                return "NA";
        }
    }

    public void setUserSex(char userSex) {
        this.userSex = userSex;
    }

    public String getUserBirthDay() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(userBirthDay);
    }

    public void setUserBirthDay(String userBirthDay) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.userBirthDay = sdf.parse(userBirthDay);
        } catch (ParseException ex) {
            Logger.getLogger(LoginUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", userName='" + userEmail + '\'' +
                ", userPass='" + userPass + '\'' +
                ", userFullName='" + userFullName + '\'' +
                ", userSex=" + userSex +
                ", userBirthDay=" + getUserBirthDay() +
                '}';
    }

    @Override
    public int compareTo(LoginUser otherUser) {
        return Integer.compare(this.userID, otherUser.userID);
    }
}