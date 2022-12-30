import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        ContactManager myContactManager = new ContactManager();
        Contact Karolina = new Contact();
        Karolina.name = "Karolina";
        Karolina.email = "000-111-222";
        myContactManager.addContact(Karolina); //methods are inserted after '.' !
        Contact Dawid = new Contact();
        Dawid.name = "Dawid";
        Dawid.phoneNumber = "333-444-555";
        myContactManager.addContact(Dawid);
        Contact Kasia = new Contact();
        Kasia.name = "Kasia";
        Kasia.phoneNumber = "666-777-888";
        myContactManager.addContact(Kasia);

        Contact result = myContactManager.searchContact("Kasia");
        System.out.println("Kasia's phone number is " + result.phoneNumber);

        // Input Scanner
        System.out.println("Enter your address: ");
        Scanner scanner = new Scanner(System.in);
        String address = scanner.nextLine();
        System.out.println("You live at: " + address);

        System.out.println("Enter your grade");
        Scanner scanner1 = new Scanner(System.in);
        int grade = scanner1.nextInt();
        if (grade > 90) {
            System.out.println("Wow, you get " + grade + " - that's an amazing result!");
        } else {
            System.out.println("Your result " + grade + " is quite nice but I'm sure you can do it better next time");
        }
    }

}

