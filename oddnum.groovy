/**
 * Created by sagar on 2/4/16.
 */
class oddnum {
public static void main(arg)
{


    File file=new File("/home/sagar/Desktop/HtmlDoc/sagar.txt")


        def lines=file.readLines()

        (lines.size()-1).times {

           if(!lines[it].toString().equals(""))
            lines[it]=(it+1)+" "+lines[it]+"\n";

        }
      file.text="";
    (lines.size()-1).times {

        if(!lines[it].toString().equals(""))

            file.append lines[it]



    }



}


}
