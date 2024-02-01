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
    private String userPhone;
    private char userSex;
    private Date userBirthDay;
    private int userRole;

    public LoginUser() {
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

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
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

    public char getUserSex() {
        return userSex;
    }

    public void setUserSex(char userSex) {
        this.userSex = userSex;
    }

    public Date getUserBirthDay() {
        return userBirthDay;
    }

   
    public void setUserBirthDay(String userBirthDay) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.userBirthDay = sdf.parse(userBirthDay);
        } catch (ParseException ex) {
            Logger.getLogger(LoginUser.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public int getUserRole() {
        return userRole;
    }

    public void setUserRole(int userRole) {
        this.userRole = userRole;
    }

    @Override
    public String toString() {
        return "LoginUser{" + "userID=" + userID + ", userEmail=" + userEmail + ", userPass=" + userPass + ", userFullName=" + userFullName + ", userPhone=" + userPhone + ", userSex=" + userSex + ", userBirthDay=" + userBirthDay + ", userRole=" + userRole + '}';
    }

 
    @Override
    public int compareTo(LoginUser otherUser) {
        return Integer.compare(this.userID, otherUser.userID);
    }
}
