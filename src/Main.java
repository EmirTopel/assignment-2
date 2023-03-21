public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Emir Topel", 22, "Computer Engineering");
        Student student2 = new Student("Ahmet Mutluer", 24, "Medicine");

        System.out.println("Student 1: " + student1.getName() + ", " + student1.getAge() + ", " + student1.getMajor());
        System.out.println("Student 2: " + student2.getName() + ", " + student2.getAge() + ", " + student2.getMajor());
    }
}