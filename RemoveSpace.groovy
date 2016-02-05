/**
 * Created by sagar on 2/4/16.
 */
public class RemoveSpace {
 public void RemoveSp1()
  {
      File file=new File("/home/sagar/Desktop/HtmlDoc/sagar.txt")
      File rm=new File("/home/sagar/Desktop/HtmlDoc/kk.txt")
      def lines=file.readLines()
 (lines.size()-1).times {i->  //"\\ \\r\\r\\n|\\r|\\n"
          rm.append lines[i].replaceAll("/^\\s+|\\s+\$/g", " ")


               }
  }
public static void main(arg)
  {
      RemoveSpace sp=new RemoveSpace();
      sp.RemoveSp1();

  }
}
