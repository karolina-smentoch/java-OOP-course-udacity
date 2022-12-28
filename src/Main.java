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
    }
}
