package Problem1;

public class Demo {
    public static void main(String[] args) {

        Student brad = new Student("Brad Ayers", 32, "M", "HS69420", 3.9);
        System.out.println(brad);

        brad.setMyGPA(3.8);
        System.out.println("Updated GPA: " + brad.getMyGPA());


        Teacher tobias = new Teacher("Tobias Elliot", 78, "M", "Computer Science", 80000);
        System.out.println(tobias);

        tobias.setSalary(55000);
        System.out.println("Updated Salary: " + tobias.getSalary());


        CollegeStudent atreus = new CollegeStudent("Atreus Cat", 4, "M", "RE263", 4.0, 1, "English");
        System.out.println(atreus);

        atreus.setMajor("Mathematics");
        atreus.setYear(2);
        System.out.println("Updated CollegeStudent: " + atreus);
    }
}
