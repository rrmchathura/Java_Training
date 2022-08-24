public class Application {
    public static void main(String[] args){

        Employee emp_1 = new Employee(1,"001","1501121212","Chathura","colombo 05");
        Employee emp_2 = new Employee(1,"001","1041121212","Chathura","colombo 05");
        Employee emp_3 = new Employee(3,"003","1701121212","John","132/4 QRS Road");
        Employee emp_4 = new Employee(1,"001","1501121212","Chathura","colombo 05");


        System.out.println("Case 1 :"+emp_1.equals(emp_2));
        System.out.println("Case 2 :"+emp_3.equals(emp_2));
        System.out.println("Case 2 :"+emp_4.equals(emp_1));
    }
}
