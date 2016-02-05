/**
 * Created by sagar on 2/4/16.
 */
class Employee extends Person {
int empid;
String company;
int sal;

    public static void main(arg){
        Map map= [name: "Sagar",age: 18,gender:"male",address:"Rajasthan",empid:100,company:"To The New Digital",sal:20000]
        Employee emp=new Employee(map);
        println("Name: "+emp.getEmpid());
        println("Name: "+emp.getName());
        println("Age: "+emp.getAge());
        println("Gender: "+emp.getGender());
        println("address: "+emp.getAddress());
        println("Name: "+emp.getCompany());
        println("Age: "+emp.getSal());



    }


}
