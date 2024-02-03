package com.example.springrestservice.intern;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "internship_work")
public class InternTaskModel {
    public String work_title;
    public String work_description;
    public String work_deadline;
    public String work_link;
    public LocalDateTime work_upload_time;

    @Id
    public String intern_id;
    public String team_lead_id;

    public InternTaskModel() {

    }

    public InternTaskModel(String work_title,
                           String work_description,
                           String work_deadline,
                           String work_link,
                           LocalDateTime work_upload_time,
                           String intern_id,
                           String team_lead_id) {
        this.work_title = work_title;
        this.work_description = work_description;
        this.work_deadline = work_deadline;
        this.work_link = work_link;
        this.work_upload_time = work_upload_time;
        this.intern_id = intern_id;
        this.team_lead_id = team_lead_id;
    }

    public String getWork_title() {
        return work_title;
    }

    public void setWork_title(String work_title) {
        this.work_title = work_title;
    }

    public String getWork_description() {
        return work_description;
    }

    public void setWork_description(String work_description) {
        this.work_description = work_description;
    }

    public String getWork_deadline() {
        return work_deadline;
    }

    public void setWork_deadline(String work_deadline) {
        this.work_deadline = work_deadline;
    }

    public String getWork_link() {
        return work_link;
    }

    public void setWork_link(String work_link) {
        this.work_link = work_link;
    }

    public LocalDateTime getWork_upload_time() {
        return work_upload_time;
    }

    public void setWork_upload_time(LocalDateTime work_upload_time) {
        this.work_upload_time = work_upload_time;
    }

    public String getIntern_id() {
        return intern_id;
    }

    public void setIntern_id(String intern_id) {
        this.intern_id = intern_id;
    }

    public String getTeam_lead_id() {
        return team_lead_id;
    }

    public void setTeam_lead_id(String team_lead_id) {
        this.team_lead_id = team_lead_id;
    }
}
