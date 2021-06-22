package class5;

import java.util.Scanner;

public class EnumTest {
    public static void main(String[] args) {


        try {
        System.out.println("Please choose server ON/OFF");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();

            Modes modes = Modes.valueOf(choice);
            switch (modes) {
                case ON : System.out.println("Lights ON");
              //  case OFF -> System.out.println("Lights OFF");
            }
        }catch (IllegalArgumentException e){
            System.out.println("Invalid choice");
        }

//        System.out.println("Please choose server ON/OFF");
//        Scanner scanner = new Scanner(System.in);
//        String choice = scanner.next();
//        try {
//            Modes modes = Modes.valueOf(choice);
//            switch (modes) {
//                case ON : System.out.println("Lights ON");
//                    //  case OFF -> System.out.println("Lights OFF");
//            }
//        }catch (IllegalArgumentException e){
//            System.out.println("Invalid choice");
//        }
    }
}
