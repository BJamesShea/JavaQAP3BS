package Problem1;

public class Student extends Person {
    private String myIdNum;
    private double myGPA;


    public Student(String myName, int myAge, String myGender, String myIdNum, double myGPA) {
        super(myName, myAge, myGender);
        this.myIdNum = myIdNum;
        this.myGPA = myGPA;
    }


    public String getMyIdNum() {
        return myIdNum;
    }

    public double getMyGPA() {
        return myGPA;
    }


    public void setMyIdNum(String myIdNum) {
        this.myIdNum = myIdNum;
    }

    public void setMyGPA(double myGPA) {
        this.myGPA = myGPA;
    }


    @Override
    public String toString() {
        return super.toString() + ", ID: " + myIdNum + ", GPA: " + myGPA;
    }
}
