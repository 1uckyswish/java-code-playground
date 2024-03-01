import java.util.Arrays;

public class ContactManager {
    private Contact[] contacts;

    public ContactManager(Contact[] contacts){
        this.contacts = Arrays.copyOf(contacts, contacts.length);
        for(int i = 0; i < contacts.length; i++){
            this.contacts = new Contact[contacts.length];
            this.contacts[i] = contacts[i];
        }
    }

    public Contact getContact(int index){
        return contacts[index];
    }

    public void setContact(Contact contact, int index) {
    this.contacts[index] = new Contact(contact);
}
}
