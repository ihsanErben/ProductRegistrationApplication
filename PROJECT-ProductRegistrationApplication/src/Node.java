
public class Node {
    String name;
    String surname;
    String phoneNumber;
    String product;
    String address;
    boolean transaction = false;
    
    
    Node next = null;
    Node prev = null;

    public Node(String name, String surname, String phoneNumber, String product, String address) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.product = product;
        this.address = address;
        
        if(this.name != null && this.surname != null && this.phoneNumber != null && this.product != null && this.address != null){
            transaction = true;
        }
        
    }

    public boolean isTransaction() {
        return transaction;
    }

    public void setTransaction(boolean transaction) {
        this.transaction = transaction;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
