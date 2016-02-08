package Groovy_Collection

/**
 * Created by sagar on 2/5/16.
 */

class Employee
{
    String Name;
    int age;
    int salary;
}
class qus8 {

public static void main(arg){
    Employee emp1=new Employee(name:"sagar",age:23,salary:50000);
    Employee emp2=new Employee(name:"Ankita",age:50,salary:500);
    Employee emp3=new Employee(name:"pooja",age:20,salary:5000);
    Employee emp4=new Employee(name:"Shreya",age:23,salary:1000);
    Employee emp5=new Employee(name:"Vaibhav",age:23,salary:10000);
    Employee emp6=new Employee(name:"Gaurav",age:26,salary:15000);
    Employee emp7=new Employee(name:"Salaman",age:18,salary:3000);
    Employee emp8=new Employee(name:"Ritesh",age:20,salary:60000);
    Employee emp9=new Employee(name:"Rahul",age:24,salary:9000);
    Employee emp10=new Employee(name:"Anamika",age:21,salary:50000);
    //(A):
    println"--------------Solution for  A-----"
    List<Employee> empList=[emp1,emp2,emp3,emp4,emp5,emp6,emp7,emp8,emp9,emp10];
    List<Map<Employee>> map=empList.findAll{it.salary<5000}*.properties
   map.each {println(it.name+", "+it.age +","+it.salary)}

     //(B)
    println"----------------Solutiion for B--------------"
    List<Map<Employee>>map1=empList.max{it.age}*.properties
    map1.each {println(it.name+", "+it.age +","+it.salary)}
    List<Map<Employee>>map2=empList.min{it.age}*.properties
    map2.each {println(it.name+", "+it.age +","+it.salary)}
   /// (C)
    println"----------------Solutiion for C--------------"

    List<Map<Employee>>map3=empList.max{it.salary}*.properties
    map1.each {println(it.name+", "+it.age +","+it.salary)}
    println"----------------Solutiion for D--------------"

    //(d)
    println empList.each{it}*.name





}
}
