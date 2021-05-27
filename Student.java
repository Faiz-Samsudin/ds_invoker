/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sociopath;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

/**
 *
 * @author Lidros
 */
public class Student implements Comparable<Student>{
    public String name;
    public Double divingRate;
    public Integer rep;
    public Integer lunchTime;
    public Integer lunchPeriod;
    public java.util.ArrayList friendsList;
    
    public Student(String name, Double divingRate, Integer rep, Integer lunchTime, Integer lunchPeriod) {
        this.name = name;
        this.divingRate = divingRate;
        this.rep = rep;
        this.lunchTime = lunchTime;
        this.lunchPeriod = lunchPeriod;
    }
    
    public void setFriendsList(ArrayList friendsList) {
        this.friendsList = friendsList;
    }
    
    @Override
    public String toString() {
        divingRate = round(divingRate, 2);
        return "Student{" + "name=" + name + ", divingRate=" + divingRate + ", lunchTime=" + lunchTime + ", lunchPeriod=" + lunchPeriod + '}';
    }
    
    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
    
    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
}
}