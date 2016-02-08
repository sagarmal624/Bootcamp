package Groovy_Collection

/**
 * Created by sagar on 2/5/16.
 */
class qus5 {

    public static void main(arg){

        List lst1=[11,12,13,14,15,16,14,15,16];
  println lst1
        lst1.removeAll {it%2!=0}
        println lst1


    }
}
