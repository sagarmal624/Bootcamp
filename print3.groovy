/**
 * Created by sagar on 2/4/16.
 */
class print3 {

    public static void printMultlipleOfThreePattern1() {
  println("---------------");
        (11).times {
           println it*3
        }

    }
    public static void printMultlipleOfThreePattern2() {
  println("---------------");
        def c = {
            println it*3
        }
        1.upto(10, c)

    }
    public static void printMultlipleOfThreePattern3() {
        println("---------------");
        1.step 10, 5, {

            println it * 3
        }
    }
        public static void printMultlipleOfThreePattern4(){
            println("---------------");
            for (number in 1..10) {
                println number*3
            }

        }
    public static void printMultlipleOfThreePattern5(){
        println("---------------");
    (1..10).each {
    	println it*3
    }

    }
        public static void main(arg) {

            print3.printMultlipleOfThreePattern1();
            print3.printMultlipleOfThreePattern2();
            print3.printMultlipleOfThreePattern3();
            print3.printMultlipleOfThreePattern4();
            print3.printMultlipleOfThreePattern5();
}
}
