/**
 * Created by sagar on 2/4/16.
 */
class GString extends Employee {


public String toString()
{
   return  super.toString()+"  " +" He Works for "+getCompany()+" with Employee Id "+getEmpid()+" and draws "+getSal()+" lots of money "

}
    public static void main(arg) {
        Map map = [name: "Sagar", age: 18, gender: "male", address: "Rajasthan", empid: 100, company: "To The New Digital", sal: 20000]

        GString str = new GString(map);
        println (str.toString())

    }


}
