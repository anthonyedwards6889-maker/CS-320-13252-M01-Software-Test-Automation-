package contact;

import java.util.HashMap;
import java.util.Map;

public class ContactService {

    private final Map<String, Contact> contacts = new HashMap<>();

    public void addContact(Contact contact) {
        if (contact == null) {
            throw new IllegalArgumentException("Contact cannot be null");
        }

        if (contacts.containsKey(contact.getContactID())) {
            throw new IllegalArgumentException("Contact ID already exists");
        }

        contacts.put(contact.getContactID(), contact);
    }

    public void deleteContact(String contactID) {
        if (!contacts.containsKey(contactID)) {
            throw new IllegalArgumentException("Contact not found");
        }

        contacts.remove(contactID);
    }

    public Contact getContact(String contactID) {
        return contacts.get(contactID);
    }

    public void updateFirstName(String contactID, String firstName) {
        findContact(contactID).setFirstName(firstName);
    }

    public void updateLastName(String contactID, String lastName) {
        findContact(contactID).setLastName(lastName);
    }

    public void updatePhone(String contactID, String phone) {
        findContact(contactID).setPhone(phone);
    }

    public void updateAddress(String contactID, String address) {
        findContact(contactID).setAddress(address);
    }

    private Contact findContact(String contactID) {
        Contact contact = contacts.get(contactID);

        if (contact == null) {
            throw new IllegalArgumentException("Contact not found");
        }

        return contact;
    }
}
