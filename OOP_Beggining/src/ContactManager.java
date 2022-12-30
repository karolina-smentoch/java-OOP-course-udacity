public class ContactManager {
        // Fields:
        Contact[] myFriends; // Contact array named myFriends based on class Contact
        int friendsCount;

        // Constructor:
        ContactManager() {
            this.friendsCount = 0; // firendsCount is an integer
            this.myFriends = new Contact[500]; // creating new array based on class Cont, size 500
        }

        // Methods:

        // This method takes a Contact object as an input parameter, and uses the friendsCount value to fill that slot in
        // the array with the contact that was passed into the method.
        void addContact(Contact contact) {
            myFriends[friendsCount] = contact;
            friendsCount++;
        }

        // Search through the array using a name String and return a Contact object once a match is found
        Contact searchContact(String searchName) {
            for (int i = 0; i < friendsCount; i++) {
                if (myFriends[i].name.equals(searchName)) {
                    return myFriends[i];
                }
            }
            return null;
        }
    }
