/**
 * Created by sagar on 2/4/16.
 */
class TruthValue {

    public boolean check(def val){
     if(val) return true else return false;

    }

public static  void main(arg){

    TruthValue val=new TruthValue()
            println(val.check("Test"))

    println(val.check("Test"))
    println(val.check('null'))
    println(val.check(null))
    println(val.check(100))
    println(val.check(0))
    List lst=[];


    println(val.check(lst))

    List lstnull=[null,null,null,null,null];
    println(val.check(lstnull))



}

}
