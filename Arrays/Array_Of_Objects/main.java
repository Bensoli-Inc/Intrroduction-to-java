class Student
{
    int rollno;
    String name;
    int marks;
}

public class Main
{
    public static void main(String[] a)
    {
        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "kevo";
        s1.marks = 400;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "ben";
        s2.marks = 420;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "caro";
        s3.marks = 380;

        //Creating an array of students

        Student students[] = new Student[3];
        students[0] = s1; 
        students[1] = s2; 
        students[2] = s3; 

        for(int i=0;i<students.length;i++)
        {
            System.out.print(students[i].rollno + " : " + students[i].name + " : " + students[i].marks);
            System.out.println();
        }
    }
}
