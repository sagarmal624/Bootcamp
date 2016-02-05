public class Findclosure
{
    def findMe = {Integer x, List y -> return y.any{it==x }}

    public static void main(String[] args)
    {
        Findclosure object = new Findclosure();

        List lst=[10,20,5,12,6,4]
        println "Result from closure is " + object.findMe(5,lst);
    }
}