/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course_management;

/**
 *
 * @author USER
 */
public class Student_work {
    private String sid,grade;
    private int marks,attendance;
    public Student_work(String sid, String grade, int marks, int attendance){
        this.sid=sid;
        //this.sname=name;
        this.grade=grade;
        this.marks=marks;
        this.attendance=attendance;
    }
    public String getsid(){
        return this.sid;
    }
    public String getgrade(){
        return this.grade;
    }
    public int getmarks(){
        return this.marks;
    }
    public int getatt(){
        return this.attendance;
    }
}
