/**
 * Created by sagar on 2/4/16.
 */
class FilesCopy {

public static void main(arg){

    File copy=new File("/home/sagar/Desktop/HtmlDoc/sagar.txt")

    new File("/home/sagar/Desktop/HtmlDoc/").eachFile() { file->

        def lines=file.readLines()

        (lines.size()-1).times {
            copy.append lines[it]

        }

    }






  }

}
