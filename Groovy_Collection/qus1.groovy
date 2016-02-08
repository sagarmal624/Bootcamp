package Groovy_Collection

/**
 * Created by sagar on 2/5/16.
 */
class qus1 {
public static void main(arg)
 {

    def range=1..10;
    List lst=range.toList();
    println lst.findAll{it%2==0}

 }
}
