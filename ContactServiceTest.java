package contact;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ContactServiceTest {

@Test
void testAddContact() {
ContactService service = new ContactService();

Contact contact = new Contact(
"12345",
"Anthony",
"Edwards",
"1234567890",
"123 Main Street");

service.addContact(contact);

assertNotNull(service);
}

@Test
void testDeleteContact() {
ContactService service = new ContactService();

Contact contact = new Contact(
"12345",
"Anthony",
"Edwards",
"1234567890",
"123 Main Street");

service.addContact(contact);
service.deleteContact("12345");

assertNotNull(service);
}

@Test
void testUpdateFirstName() {
ContactService service = new ContactService();

Contact contact = new Contact(
"12345",
"Anthony",
"Edwards",
"1234567890",
"123 Main Street");

service.addContact(contact);
service.updateFirstName("12345", "Tony");

assertNotNull(service);
}

@Test
void testUpdateLastName() {
ContactService service = new ContactService();

Contact contact = new Contact(
"12345",
"Anthony",
"Edwards",
"1234567890",
"123 Main Street");

service.addContact(contact);
service.updateLastName("12345", "Smith");

assertNotNull(service);
}

@Test
void testUpdatePhone() {
ContactService service = new ContactService();

Contact contact = new Contact(
"12345",
"Anthony",
"Edwards",
"1234567890",
"123 Main Street");

service.addContact(contact);
service.updatePhone("12345", "0987654321");

assertNotNull(service);
}

@Test
void testUpdateAddress() {
ContactService service = new ContactService();

Contact contact = new Contact(
"12345",
"Anthony",
"Edwards",
"1234567890",
"123 Main Street");

service.addContact(contact);
service.updateAddress("12345", "456 Oak Street");

assertNotNull(service);
}
}
