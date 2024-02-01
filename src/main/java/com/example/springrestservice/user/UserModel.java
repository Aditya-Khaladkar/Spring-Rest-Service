package com.example.springrestservice.user;

public class UserModel {
    public String email;
    public String emp_pos;
    public String first_name;
    public String last_name;
    public String full_name;
    public String team_lead;
    public String user_uid;

    public UserModel(String email,
                     String emp_pos,
                     String first_name,
                     String last_name,
                     String full_name,
                     String team_lead,
                     String user_uid) {
        this.email = email;
        this.emp_pos = emp_pos;
        this.first_name = first_name;
        this.last_name = last_name;
        this.full_name = full_name;
        this.team_lead = team_lead;
        this.user_uid = user_uid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmp_pos() {
        return emp_pos;
    }

    public void setEmp_pos(String emp_pos) {
        this.emp_pos = emp_pos;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getTeam_lead() {
        return team_lead;
    }

    public void setTeam_lead(String team_lead) {
        this.team_lead = team_lead;
    }

    public String getUser_uid() {
        return user_uid;
    }

    public void setUser_uid(String user_uid) {
        this.user_uid = user_uid;
    }
}
