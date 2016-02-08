package Groovy_Collection

/**
 * Created by sagar on 2/5/16.
 */

class EMployee
{
    String Name
    int  Age
    String DepartmentName
    int EMployeeNumber
    int salary

}
class qus23 {
    public static void main(arg) {
        EMployee emp1 = new EMployee(Name: "sagar", Age: 20, DepartmentName: 'Computer', EMployeeNumber: 100, salary: 5000)
        EMployee emp2 = new EMployee(Name: "Ankita", Age: 19, DepartmentName: 'Eng', EMployeeNumber: 101, salary: 5000)
        EMployee emp3 = new EMployee(Name: "Rahul", Age: 21, DepartmentName: 'EE', EMployeeNumber: 102, salary: 1000)
        EMployee emp4 = new EMployee(Name: "Ritesh", Age: 40, DepartmentName: 'Computer', EMployeeNumber: 103, salary: 15000)
        EMployee emp5 = new EMployee(Name: "shakshi", Age: 29, DepartmentName: 'MGNT', EMployeeNumber: 104, salary: 12000)
        EMployee emp6 = new EMployee(Name: "Vabhav", Age: 25, DepartmentName: 'FIN', EMployeeNumber: 105, salary: 100)
        EMployee emp7 = new EMployee(Name: "Prakhar", Age: 20, DepartmentName: 'Computer', EMployeeNumber: 106, salary: 5000)
        List<EMployee> emp = [emp1, emp2, emp3, emp4, emp5, emp6, emp7]
//a
        println '.....................Group the employees on the basis of the bracket in which their salary falls. The ranges are 0-5000, 5001 and 10000, and so on....................'
        List result1 = emp.findAll({ it.salary > 0 && it.salary < 5000 })
        List result2 = emp.findAll({ it.salary > 5000 && it.salary < 20000 })

        println "Employee having salary >0 and < 5000 are:-"
        result1?.each {
            println(it.Name)
        }

        println("*************************************************")
        println "Employee having salary >5000 and < 20000 are:-"
        result2?.each {
            println(it.Name)
        }
        println("*************************************************")

        //(b)
        println "--------------------------Get a count of the number of employees in each department----------------------------------"
        List dept = emp.each { it }*.DepartmentName;

        dept.unique().each { String d -> println d + ": " + emp.findAll({ it.DepartmentName == d }).size() }
//(c)
        println(".Employee whose  age is > 18 and < 35....................")
        List ageList = emp.findAll { it.Age > 18 && it.Age < 35 }
        ageList.each { println it.name }


        List f = [];
        emp.each {
            f.push(it.Name.charAt(0));
        }
//d

 println("------------Group of employee on the basis of First char of each employee-------------------------")
        f.unique().each { char c ->
            println emp.findAll { it.Name.charAt(0) == c }.size()
        }
println "------------------Group of employee on the basis of First char of each employee----and employee whose age is > 25-------------------"
            List ListOfFirstChar=[]
        List name=[]
        f.unique().each { char c ->
            ListOfFirstChar = emp.findAll { it.Name.charAt(0) == c }
                      name=ListOfFirstChar.findAll{it.Age>25}
            name.each{println it.Name}
     }

//e
        println "-----------------------------Group the employees according to their department. --------------------------"
        dept.unique().each { String d ->
        List lst=emp.findAll({ it.DepartmentName == d });
           println d+":" +lst.Name;

        }


    }


}
