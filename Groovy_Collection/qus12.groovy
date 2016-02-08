package Groovy_Collection

/**
 * Created by sagar on 2/5/16.
 */
class qus12 {
    public static void main(arg)
    {
        def range='a'..'z'
        List lst=range as List
         println lst.findAll{it>'j'}

    }
}
