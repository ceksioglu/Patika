package week2;

public class StudentInformation {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "Tarih", "+904399430");
        Teacher t2 = new Teacher("Ahmet Hoca", "Fizik", "+904324232");
        Teacher t3 = new Teacher("Evren Hoca", "Biyoloji", "+904324232");

        Course tarih = new Course("Tarih", "101", "Tarih");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102","Fizik");
        fizik.addTeacher(t2);

        Course biyo = new Course("Biyoloji", "103","Biyoloji");
        biyo.addTeacher(t3);

        Student s1 = new Student("Dilek Kural","123","4", tarih, fizik, biyo);
        s1.addBulkExamNote(90,70,50,40, 50, 80);

        Student s2 = new Student("Dilek Kural","124","4", tarih, fizik, biyo);
        s2.addBulkExamNote(40,50,30,80, 50, 70);
        s2.isPass();
        s2.printNote();

    }

    public static class Teacher {
        String name;
        String branch;
        String number;

        Teacher(String name, String branch, String number) {
            this.name = name;
            this.branch = branch;
            this.number = number;
        }

        void print() {
            System.out.println("Adı:" + this.name);
            System.out.println("Adı:" + this.branch);
            System.out.println("Adı:" + this.number);
        }
    }

    public static class Course {
        Teacher teacher;
        String name;
        String code;
        String prefix;
        int note;
        int oral;

        Course(String name, String code, String prefix) {
            this.name = name;
            this.code = code;
            this.prefix = prefix;
            int note = 0;
            int oral = 0;
        }

        void addTeacher(Teacher teacher) {
            if (teacher.branch.equals(this.prefix)) {
                this.teacher = teacher;
            } else {
                System.out.println("Öğretmen ve ders uyuşmuyor!");
            }

        }

        void PrintTeacher() {
            this.teacher.print();
        }
    }

    public static class Student {
        Course c1;
        Course c2;
        Course c3;
        String name;
        String studentNo;
        String courses;
        double average;
        boolean isPass;

        Student(String name, String studentNo, String courses, Course c1, Course c2, Course c3) {
            this.name = name;
            this.studentNo = studentNo;
            this.courses = courses;
            this.c1 = c1;
            this.c2 = c2;
            this.c3 = c3;
            this.average = 0.0;
            this.isPass = false;

        }

        void addBulkExamNote(double note1, double note2, double note3, double oral1, double oral2, double oral3) {
            if (note1 >= 0 && note1 <= 100) {
                c1.note = (int) ((note1 * 0.80) + (oral1 * 0.20));
            }
            if (note2 >= 0 && note2 <= 100) {
                c2.note = (int) ((note2 * 0.80) + (oral2 * 0.20));
            }
            if (note3 >= 0 && note3 <= 100) {
                c3.note = (int) ((note3 * 0.80) + (oral3 * 0.20));
            }
        }

        void printNote(){
            System.out.println(this.c1.name + " " +this.c1.note);
            System.out.println(this.c2.name + " " +this.c2.note);
            System.out.println(this.c3.name + " " +this.c3.note);
        }

        void isPass(){
            this.average = (this.c1.note + this.c2.note + this.c3.note ) / 3.0;
            if(this.average > 55) {
                System.out.println("Sınıfı geçti.");
                System.out.println("Ortalama: "+(int) this.average);
            } else {
                System.out.println("Sınıfta kaldı!");
                System.out.println("Ortalama: "+(int) this.average);
            }
        }
    }
}



