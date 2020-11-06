package io.pivotal.pal.tracker;

import java.time.LocalDate;
import java.util.Objects;

public class TimeEntry {

    private Long id;
    private Long projectId;
    private Long userId;
    private LocalDate date;
    private Integer hours;

    //new TimeEntry(created.getId(), 321L, 654L, LocalDate.parse("2017-01-09"), 5)
    public TimeEntry(Long id, Long projectId, Long userId, LocalDate date, Integer hours){
        this.id = id;
        this.projectId = projectId;
        this.userId = userId;
        this.date = date;
        this.hours = hours;
    }
    //new TimeEntry(projectId, userId, LocalDate.parse("2017-01-08"), 8)
    public TimeEntry(Long projectId, Long userId, LocalDate date, Integer hours){
        this.projectId = projectId;
        this.userId = userId;
        this.date = date;
        this.hours = hours;
    }
    //new TimeEntry(created.getId(), 321L, 654L, LocalDate.parse("2017-01-09"), 5)
    public TimeEntry(Integer id, Integer projectId, Integer userId, LocalDate date, Integer hours){
        this.id = Long.valueOf(id);
        this.projectId = Long.valueOf(projectId);
        this.userId = Long.valueOf(userId);
        this.date = date;
        this.hours = hours;
    }
    //new TimeEntry(projectId, userId, LocalDate.parse("2017-01-08"), 8)
    public TimeEntry(Integer projectId, Integer userId, LocalDate date, Integer hours){
        this.projectId = Long.valueOf(projectId);
        this.userId = Long.valueOf(userId);
        this.date = date;
        this.hours = hours;
    }
    public TimeEntry(){

    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getHours() {
        return hours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimeEntry timeEntry = (TimeEntry) o;
        return Objects.equals(projectId, timeEntry.projectId) &&
                Objects.equals(userId, timeEntry.userId) &&
                Objects.equals(date, timeEntry.date) &&
                Objects.equals(hours, timeEntry.hours);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, userId, date, hours);
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }


}
