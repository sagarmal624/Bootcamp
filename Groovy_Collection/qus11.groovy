package Groovy_Collection

/**
 * Created by sagar on 2/5/16.
 */
class qus11 {
    public static void main(arg)
    {
println("---------------------")
       //Clousure for table 2
        def tableOfTwo={println it*2}
        1.upto(10,tableOfTwo)
print("--------------------")
     def tableOf12={println it*12}
     1.upto(10,tableOf12)

    }



}
