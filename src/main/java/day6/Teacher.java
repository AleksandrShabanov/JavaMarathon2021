package day6;

//3. Создать класс Teacher (Преподаватель), имеющий поля “Имя”, “Предмет”.
//   Создать класс Student (Студент) с полем “Имя”.
//   Каждый класс имеет конструктор (с параметрами), set и get методы по необходимости,
//   а также у преподавателя есть метод evaluate (оценить студента), принимающий в качестве
//   аргумента студента, и работающий следующим образом: внутри метода случайным образом генерируется
//   число от 2 до 5, затем в консоль выводится строка: "Преподаватель ИМЯПРЕПОДАВАТЕЛЯ оценил студента
//   с именем ИМЯСТУДЕНТА по предмету ИМЯПРЕДМЕТА на оценку ОЦЕНКА."
//
//   Все слова, написанные большими буквами, должны быть заменены соответствующими значениями.
//   ОЦЕНКА должна принимать значения "отлично”, "хорошо”, "удовлетворительно" или "неудовлетворительно",
//   в зависимости от значения случайно сгенерированного числа.
//
//   Создайте по 1 экземпляру каждого класса, у преподавателя вызовите метод оценки студента,
//   передав студента в качестве аргумента метода.
//

import java.util.Random;

public class Teacher {

    private String name;
    private String object;



    public Teacher(String name, String object){
        this.name = name;
        this.object = object;
    }

    void evaluate (Student student){
        Random random = new Random();

        int grade = 2 + random.nextInt(4);
        String gradeResult = "";

        if (grade == 5){
            gradeResult = "\"отлично\"";
        }
        else if (grade == 4){
            gradeResult = "\"хорошо\"";
        }
        else if (grade == 3){
            gradeResult = "\"удовлетворительно\"";
        }
        else
            gradeResult = "\"неудовлетворительно\"";

        System.out.println("Преподователь " + name + " оценил студента с именем " + student.getName() +
                " по предмету " + object + " на оценку " + gradeResult);
    }

}
