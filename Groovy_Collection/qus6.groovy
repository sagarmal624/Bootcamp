package Groovy_Collection

/**
 * Created by sagar on 2/5/16.
 */
class qus6 {
    public static void main(arg){
        def lst=[1, 2, 3, "element1", 0.3, [2, 4, 6], 0..10 ]

       lst.each {
           println(" Class >> "+it.class)
       }
        print(lst.get(6))

        //Here we get Error...java.lang.IndexOutOfBoundsException...
              // println(lst.get(9))
        // To Overcome above problem we hv to use getAt()
                println(lst.getAt(9))
    }


}
