/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App.model;

/**
 *
 * @author PC Hoang Anh
 */
public class tbl_Mark {

    private int Student_ID;
    private int Subject_ID;
    private float mark;
    private String note;

    public int getStudent_ID() {
        return Student_ID;
    }

    public void setStudent_ID(int Student_ID) {
        this.Student_ID = Student_ID;
    }

    public int getSubject_ID() {
        return Subject_ID;
    }

    public void setSubject_ID(int Subject_ID) {
        this.Subject_ID = Subject_ID;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public tbl_Mark(int Student_ID, int Subject_ID, float mark, String note) {
        this.Student_ID = Student_ID;
        this.Subject_ID = Subject_ID;
        this.mark = mark;
        this.note = note;
    }

    @Override
    public String toString() {
        return "tbl_Mark{" + "Student_ID=" + Student_ID + ", Subject_ID=" + Subject_ID + ", mark=" + mark + ", note=" + note + '}';
    }

}
