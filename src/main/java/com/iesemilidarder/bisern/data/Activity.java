package com.iesemilidarder.bisern.data;

public class Activity extends Product {
  /*  public enum activityType {

    }*/

   private ActivityType activityType;
   private Schedule schedule;
   private Assessment assessment;


    public ActivityType getActivityType() {
        return activityType;
    }
    public void setActivityType(ActivityType activityType) {
        this.activityType = activityType;
    }


    public Schedule getSchedule() {
        return schedule;
    }
    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }


    public Assessment getAssessment() {
        return assessment;
    }
    public void setAssessment(Assessment assessment) {
        this.assessment = assessment;
    }
}