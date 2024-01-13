package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class User implements Comparable<User> {
    private int userID;
    private String userName;
    private String userPass;
    private String userFullName;
    private char userSex;
    private Date userBirthDay;

    public User(int userID, String userName, String userPass, String userFullName, char userSex, String userBirthDay) {
        this.userID = userID;
        this.userName = userName;
        this.userPass = userPass;
        this.userFullName = userFullName;
        this.userSex = userSex;

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.userBirthDay = sdf.parse(userBirthDay);
        } catch (ParseException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", userPass='" + userPass + '\'' +
                ", userFullName='" + userFullName + '\'' +
                ", userSex=" + userSex +
                ", userBirthDay=" + getUserBirthDay() +
                '}';
    }

    @Override
    public int compareTo(User otherUser) {
        return Integer.compare(this.userID, otherUser.userID);
    }
}
