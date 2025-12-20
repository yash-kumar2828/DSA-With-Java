public class StudentClass{
    public static void main(String[] args) {
        Student std1=new Student();
        std1.name="Yash Kumar";
        std1.setRno(227);
        std1.precentage=80.5;
        System.out.println("name:"+std1.name);
        System.out.println("roll no:"+std1.getRno());
        System.out.println("percentage:"+std1.precentage);
    } 
}