package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Мария Ивановна", "Математика");
        Student student = new Student("Коля");
        teacher.evaluate(student);
        System.out.println("Преподаватель " + teacher.getName() + " оценила студента с именем " + student.getName() + " по предмету "
                + teacher.getSubject() + " на оценку " + teacher.markLetter);
    }
}
