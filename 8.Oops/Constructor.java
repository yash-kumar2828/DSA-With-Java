public class Constructor {

    public static class Student {
        String name;
        int rno;
        double percentage;
        final String schoolName="HSC";
        private static int numberOfStudents;

        // constructor
        public Student(String name, int rno, double percentage) {
            this.name = name;
            this.rno = rno;
            this.percentage = percentage;
            numberOfStudents++;
        }

        public static  int getNumberOfStudents(){
            return numberOfStudents;
        }
    }

    public static void main(String[] args) {
        Student std1 = new Student("Yash Kumar", 227, 80.5);
        System.out.println("Name: " + std1.name);
        System.out.println("Roll No: " + std1.rno);
        System.out.println("Percentage: " + std1.percentage);
        System.out.println("School Name:"+std1.schoolName);

        Student std2=new Student("Kalpana Kumari",100,80.5);
        System.out.println("Name: " + std2.name);
        System.out.println("Roll No: " + std2.rno);
        System.out.println("Percentage: " + std2.percentage);
        System.out.println("School Name:"+std2.schoolName);

        Student std3=new Student("Kumar",100,80.5);
        System.out.println("Name: " + std3.name);
        System.out.println("Roll No: " + std3.rno);
        System.out.println("Percentage: " + std3.percentage);
        System.out.println("School Name:"+std3.schoolName);

        System.out.println("Number of student:"+Student.getNumberOfStudents());

    }
}
