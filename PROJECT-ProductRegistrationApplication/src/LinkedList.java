
import java.util.Scanner;

public class LinkedList {

Node first = null;
Node last = null;

int id = 0;

Scanner input = new Scanner(System.in);

public void add_customer() {
    System.out.print("name: ");
    String name = input.next();
    System.out.print("surname: ");
    String surname = input.next();
    System.out.print("phone number: ");
    String phoneNumber = input.next();
    System.out.print("product: ");
    String product = input.next();
    System.out.print("address: ");
    String address = input.next();

    Node kisi = new Node(name, surname, phoneNumber, product, address);

    if (first == null) {
        first = kisi;
        last = kisi;
    } else {
        last.next = kisi;
        kisi.prev = last;
            last = kisi;
        }
        if (kisi.isTransaction()) {
            System.out.println(name + " " + surname + "'s transaction was approved.");
        }
    }

    public void remove_consumer() {
        if (first == null) {
            System.out.println("It is empty.");
            return;
        }
        System.out.print("Enter the name of the customer you want to delete: ");
        String D_name = input.next();

        Node tmp = first;

        while (tmp != null) {
            if (tmp.getName().equals(D_name)) {

                if (tmp == first) {
                    first = first.next;
                    first.prev = null;
                    System.out.println("The costumer was deleted.");
                } else if (tmp == last) {
                    last = last.prev;
                    last.next = null;
                    System.out.println("The costumer was deleted.");
                } else {
                    tmp.prev.next = tmp.next;
                    tmp.next.prev = tmp.prev;
                    tmp.prev = null;
                    tmp.next = null;
                    System.out.println("The costumer was deleted.");
                }

                return;
            } else {
                tmp = tmp.next;
            }
        }
        System.out.println("There is no such name: " + D_name);
    }

    public void update() {
        if (first == null) {
            System.out.println("It is empty.");
            return;
        }
        System.out.print("enter the id of the costumer you want to update: ");
        int n = input.nextInt();
        System.out.println("1)name    2)surname   3)phoneNumber   4)product   5)address");
        System.out.print("Which one do you want to update: ");
        int update = input.nextInt();
        Node tmp = first;
        while (n != 1) {

            tmp = tmp.next;
            n--;
        }

        switch (update) {
            case 1:
                System.out.print("new name: ");
                String newName = input.next();
                tmp.setName(newName);
                break;
            case 2:
                System.out.print("new surname: ");
                String newSurnname = input.next();
                tmp.setSurname(newSurnname);
                break;
            case 3:
                System.out.print("new phoneNumber: ");
                String newphoneNumber = input.next();
                tmp.setPhoneNumber(newphoneNumber);
                break;
            case 4:
                System.out.print("new product: ");
                String newproduct = input.next();
                tmp.setProduct(newproduct);
                break;
            case 5:
                System.out.print("new address: ");
                String newAddress = input.next();
                tmp.setAddress(newAddress);
                break;
            default:
                System.out.println("INVALID VALUE.");
                break;
        }
        System.out.println("");
        System.out.println("--- The costumer was updated. ---");
        System.out.println("");
    }

    public void print_all_costumers() {
        if (first == null) {
            System.out.println("It is empty.");
            return;
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        Node tmp = first;
        while (tmp != null) {
            id++;
            System.out.println("costumer id: " + id);
            System.out.println("name: " + tmp.name);
            System.out.println("surname: " + tmp.surname);
            System.out.println("phone number: " + tmp.phoneNumber);
            System.out.println("product: " + tmp.product);
            System.out.println("address: " + tmp.address);
            System.out.println("------------------------------------------------------------------------------------------------------------------------");
            tmp = tmp.next;
        }

    }
}
