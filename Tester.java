import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        List list = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Print your list below\n write one of the following string to proceed: size, clear, print \n if u want to add smth to the list just write and send.");

        while (true){
            String str = scan.nextLine();
        switch (str){
            case "size":
                System.out.println("list size "+list.size());
                break;
            case "clear":
                System.out.println("list cleared");
                list.clear();
                break;
            case "print":
                System.out.println("print of the list:\n"+list);
                break;
            default:
                list.add(str);
        }
        }
    }

}
