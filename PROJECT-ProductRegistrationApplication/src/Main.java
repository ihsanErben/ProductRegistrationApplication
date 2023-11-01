
import java.util.Scanner;

public class Main {

    /*
    ekle
    sil
    guncelle
    musteri ara
    yazdir
    cikis
    
    
    ad
    soyad
    telefon
    adres
    urun
     */
    public static void main(String[] args) {
        System.out.println("-------------------------------------------------------------------------------------");
        Scanner input = new Scanner(System.in);
        int b = 4;
        LinkedList x = new LinkedList();
        while (b == 4) {
            System.out.println("0 - exit ");
            System.out.println("1 - add costumer ");
            System.out.println("2 - remove costumer ");
            System.out.println("3 - update costumer");
            System.out.println("4 - print all costumers ");
            System.out.print("CHOOSE AN OPTION: ");
            int option = input.nextInt();
            System.out.println("");
            switch (option) {
                case 0:
                    b = 3;
                    break;
                case 1:
                    x.add_customer();
                    break;
                case 2:
                    x.remove_consumer();
                    break;
                case 3:
                    x.update();
                    break;
                case 4:
                    x.print_all_costumers();
                    break;
                default:
                    System.out.println("INVALID VALUE.");
                    break;
            }
            System.out.println("");
        }

    }
}
