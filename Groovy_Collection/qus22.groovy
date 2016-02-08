package Groovy_Collection

/**
 * Created by sagar on 2/5/16.
 */
class qus22 {
public static void main(arg){
    Map m = ['Computing': ['Computing' : 600, 'Information Systems' : 300], 'Engineering' : ['Civil' : 200, 'Mechanical' : 100], 'Management' : ['Management' : 800] ]
//(a)
      println m.size();
    //(b)
     Map map=m.get('Computing');

      println map.size()

    //(c)

      println m.get('Engineering').get('Civil')
}
}
