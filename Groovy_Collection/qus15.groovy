package Groovy_Collection

/**
 * Created by sagar on 2/5/16.
 */

class Stack
{
    List lst=[];
Object Pop(){

    return lst.pop()
}
    void Push(item)
    {
        lst.push(item)

    }
    void displayAll()
    {
        println(lst);
    }
    Object Top()
    {
     println(lst.last())
     return lst.last();
}

}
class qus15 {
public static void main(arg){
    Stack stack=new Stack()
    stack.Push(10);
    stack.Push(11)
    stack.Pop()
    stack.displayAll();
    stack.Push(12);
    stack.Push(13);
    stack.displayAll();
    stack.Top();

}
}
