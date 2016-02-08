package Groovy_Collection

/**
 * Created by sagar on 2/5/16.
 */
class qus17 {

public static void main(ar){

    Map map=[:]
    map.put("sagar",23);
    map.put("Rahul",20);
    map.put("Vaibhav",26);
    map.put("Tushar",23);
    map.put("Ankita",29);
    map.put("shyamlal",31);
    map.put("hello",15);

    map.put("Ram",50);
    map.put("Ritesh",15);

    map.each {println it.key+":"+it.value}

    for(i in map){println i.key+":"+i.value  }

}
}
