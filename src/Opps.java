
class Student {
    String name;
    int age;
    int standard;

    public Student() {

    }


    public void printInfo(int age) {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.standard);


    }
   // copy constructor
    Student(Student s2){
       this.name=s2.name;
       this.age= s2.age;
       this.standard=s2.standard;
    }

}

// this is my main function
public class Opps {
    public static void main (String args[]){
    Student s1 = new Student();
    s1.name ="Shikha";
    s1.age = 18;
    s1.standard =12;

    Student s2 = new Student(s1);   // parameter of s1 object; // using for make a copy of objects
    s2.printInfo(s1.age);

    }
}
