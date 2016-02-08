package Groovy_Collection

/**
 * Created by sagar on 2/5/16.
 */
class qus2 {
    public static void main(arg) {
    List lst=[10,2,5,6,4,2,5,1,0,10,2,5,4,3,6]
       //Unqiue Element using set
        Set set=lst as Set

        println set
       //Unique Element using unique method of List
        println lst.unique();
    }
}