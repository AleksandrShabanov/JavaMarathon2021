package day9.Task1;

public class Task1 {
    public static void main(String[] args) {

        Student student = new Student("Meg", "IT");
        Teacher teacher = new Teacher("Bob", "Java");

        System.out.println("Название учебной группы у студента: " + student.getGroupName());
        System.out.println("Название предмета у преподователя: " + teacher.getSubjectName());
        System.out.println();
        student.printInfo();
        teacher.printInfo();

    }
}
