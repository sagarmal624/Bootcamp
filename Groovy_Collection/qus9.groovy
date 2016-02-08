package Groovy_Collection

/**
 * Created by sagar on 2/5/16.
 */
class qus9 {
public static void main(arg){

    String s = "this string needs to be split"

    println(s.tokenize(" "))//return list of token and String split by space

    println s.tokenize()//return list and split by default delimeter(space) ;

    String s1 = "this string needs to be split"
    println s1.split()//return String array
    println s1.split(/\s/) //return String array and split by given regex

    String s2 = "are.you.trying.to.split.me.mister?"
    println s2.tokenize(".")
    println s2.split(".")

//The split() method returns a string [] instance and the  tokenize() method returns a List instance
    //The split()  can take regex as delimeter  where as  tokenize does not
    //tokenize() ,which returns a List ,will ignore empty string (when a delimeter appears twice in  succession) where as split() keeps such string.
   // The tokenize() method uses each character of a String as delimeter where as split()  takes the entire string as  delimeter

}
}
