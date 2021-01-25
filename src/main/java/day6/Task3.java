package day6;

public class Task3 {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Горбунов Иван Борисович", "математика");
        Student student = new Student("Простаков Кирилл Викторович");

        teacher.evaluate(student);
    }
}
