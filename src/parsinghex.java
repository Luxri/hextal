import java.util.Scanner;


public class parsinghex {
    public static void main(String[] args) {
        Scanner he = new Scanner(System.in);
        System.out.println("Write a hexadecimal number");
        String hexnumber = he.nextLine();
        if (hexnumber.contains("0x")) {
            System.out.println(hexnumber);
        } else if (hexnumber.contains("a,b,c,d,e,f")){
            
        }
    }
}
