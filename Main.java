import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Sicaklik Giriniz :");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("kayak Yapabilirsiniz!");
        }
        if (heat > 25){
            System.out.println("Yuzmeye Gidebilirsiniz!");
        }
        if (heat >= 5 && heat <= 10){
            System.out.println("Sinemaya Gidebilirsiniz!");
        }
        if (heat >=15 && heat <=25){
            System.out.println("Piknige Gidebilirsiniz!");
        }
        if (heat >=10 && heat <=15){
            System.out.println("Piknige veya Sinemaya gidebilirsiniz!");

            }
        }
    }



