/**
 * Created by sagar on 2/4/16.
 */
class CopyImg {
    public static void main(arg){

        File img1=new File("/home/sagar/Pictures/groovy.png")
        File copy=new File("/home/sagar/Desktop/HtmlDoc/g.png")

        def b=img1.readBytes();
        copy.append(b);
     }

}








