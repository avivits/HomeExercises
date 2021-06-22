package class8HW;

//import class8.User;

import java.lang.reflect.Method;
import java.util.regex.Pattern;

public class class8Solution {
    public static void main(String[] args) {

        //------------------Q1--------------------------------;
        StringBuilder sb = new StringBuilder();
        sb.append("h");
        sb.append("e");
        sb.append("l");
        sb.append("l");
        sb.append("o");
        System.out.println(sb);

        String[] someWords = {"hello","world", "radar", "math", "kayak", "bank", "rotor"};

        for ( int i=0 ; i <someWords.length ; i++){
            StringBuilder sb1 = new StringBuilder(someWords[i]);

            if (someWords[i].equalsIgnoreCase(sb1.reverse().toString())){
                System.out.println(someWords[i]);

            }

        }

       //---------------------Q2--------------------

        String myName= String.format("name: %s %n age: %d ", "avivit", 42);
        System.out.println(myName);
        System.out.printf("%s%d", "name: avivit  age: " , 42);

        //"The biggest concern is that we don't know about a problem while compiling,  only after running the program

        //----------------------------Q3-------------------------------
                                    //?


       //-------------------------Q4-------------------------------
        // In generics we can use T (type) / E (element) / K (key) / V (value),which are interchangeable


        //---------------------------Q6-------------------------------
        //"YAGNI - “You Aren’t Gonna Need It” > there are 2 methods are not used
        //"DRY - “Don’t Repeat Yourself” > calling same method again

       //---------------------------------Q7-----------------------------

        StringBuilder sb2 = new StringBuilder("Dictionary");
        System.out.println(sb2.indexOf("a"));
        System.out.println(sb2.replace(6,8,"x"));

        //----------------------Q8--------------------------------
        Method[] methods = String.class.getDeclaredMethods();
        int methodsNum=0;
        for(Method method : methods){
            methodsNum=methodsNum+1;

            System.out.println(method.getName()); // getName setName
        }
        System.out.println("The number of String methods is: " + methodsNum);

        //------------------------Q5------------------------------
            String s = "avivit";
            double d = 5.26;
            genericsMethod(s);
            genericsMethod(d);


    }
            public static  <T> void genericsMethod (T type){

              System.out.println(type);

         }

}
