/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sociopath;

/**
 * 
 * @author Lidros
 */

public class TestSociopath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WeightedGraph<Student, Integer> sociopath = new WeightedGraph<>();
        
        //creating the students
        //Student(Double divingRate, Integer rep, Integer lunchTime, Integer lunchPeriod)
        String[] nama = new String[]{"Abu", "Barb", "Chim", "Dar", "Edo", "Fad", "Gotye", "Hal", "Indie", "Jack"};
        for (Integer i = 0; i < nama.length; i++) {
            java.util.Random r = new java.util.Random();
            int rep = r.nextInt(11);    //generate from 0 to 10
            double diverate = 0 + (100 - 0) * r.nextDouble();    //generate from 0 to 100
            int lunchtime = r.nextInt(1400 - 1100) + 1100;    //generate from 1100 to 1400
            int lunchperiod = r.nextInt(60 - 5) + 5;    //generate from 5 to 60
            sociopath.addVertex(new Student(nama[i], diverate, rep, lunchtime, lunchperiod));
        }
        
        System.out.println("The number of the vertices in graph: " + sociopath.getSize());
        
        System.out.println("Students and their vertices ");
        for (int i = 0; i <= sociopath.getSize()-1; i++) {
            System.out.println(i + ": " + sociopath.getVertex(i));
        }
        System.out.println("");
    }
}
