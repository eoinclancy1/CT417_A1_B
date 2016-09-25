/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrationTesting;
import Student_reg_system.CourseProgramme;
import Student_reg_system.Module;
import Student_reg_system.Student;
import java.util.ArrayList;
import org.joda.time.LocalDate;
import java.io.Console;
/**
 *
 * @author eoin
 */
public class Tester {
    
    public static void main(String args[]){
        /****************** Define Students ***********************/
        Student s1 = new Student("Anthony Martial",21,"19/09/1995","CSIT");
        Student s2 = new Student("Marcus Rashford",18,"11/01/1998","CSIT");
        Student s3 = new Student("Jose Mourinho",53,"14/05/1963","BP");
        Student s4 = new Student("Zlatan Ibrahimovic",34,"22/03/1982","BP");
        Student s5 = new Student("Roy Keane",49,"10/07/1967","EE");
        Student s6 = new Student("Tim Fosu-Mensah",20,"05/09/1996","EE");
        
        /***************** All Students **************************/
        ArrayList<Student> group1 = new ArrayList<Student>();
        group1.add(s1);
        group1.add(s2);
        group1.add(s3);
        group1.add(s4);
        group1.add(s5);
        group1.add(s6);
        
        /***************** CS&IT and BP **************************/
        ArrayList<Student> group2 = new ArrayList<Student>();
        group2.add(s1);
        group2.add(s2);
        group2.add(s3);
        group2.add(s4);
        
        /***************** BP and EE *****************************/
        ArrayList<Student> group3 = new ArrayList<Student>();
        group3.add(s3);
        group3.add(s4);
        group3.add(s5);
        group3.add(s6);
        
        /***************** Module Definitions *******************/
        Module CT417 = new Module("Software Eng. 3","CT417",group1);
        Module CT401 = new Module("Machine Learning","CT401",group2);
        Module EE445 = new Module("DSP","EE445",group3);
        Module EE451 = new Module("System on Chip 1","EE451",group3);
        
        /**************** CS Modules ****************************/
        ArrayList<Module> CSmodules = new ArrayList<Module>();
        CSmodules.add(CT417);
        CSmodules.add(CT401);
        LocalDate start = new LocalDate(2016,9,5);
        LocalDate end = new LocalDate(2017,5,31);
        CourseProgramme CSIT = new CourseProgramme("CSIT",CSmodules,start,end);
        
        /**************** BP Modules ****************************/
        ArrayList<Module> BPmodules = new ArrayList<Module>();
        BPmodules.add(EE445);
        BPmodules.add(CT417);
        BPmodules.add(CT401);
        BPmodules.add(EE451);
        CourseProgramme BP = new CourseProgramme("BP",BPmodules,start,end);
        
        /**************** EE Modules ****************************/
        ArrayList<Module> EEmodules = new ArrayList<Module>();
        EEmodules.add(EE451);
        EEmodules.add(EE445);
        EEmodules.add(CT401);
        CourseProgramme EE = new CourseProgramme("EE",EEmodules,start,end);
        
        /****** Prints Student name, Course & modules **********/
        CSIT.printStudents();
        BP.printStudents();
        EE.printStudents();

       
       
        
    }
    
}
