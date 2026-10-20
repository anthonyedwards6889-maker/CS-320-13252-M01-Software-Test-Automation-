package contact;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ContactTest {

@Test
void testContactCreation() {
Contact contact = new Contact(
"12345",
"Anthony",
"Edwards",
"1234567890",
"123 Main Street"
);

assertEquals("12345", contact.getContactID());
assertEquals("Anthony", contact.getFirstName());
assertEquals("Edwards", contact.getLastName());
assertEquals("1234567890", contact.getPhone());
assertEquals("123 Main Street", contact.getAddress());
}

@Test
void testNullValues() {
assertThrows(IllegalArgumentException.class, () ->
new Contact(null, "Anthony", "Edwards",
"1234567890", "123 Main Street"));

assertThrows(IllegalArgumentException.class, () ->
new Contact("12345", null, "Edwards",
"1234567890", "123 Main Street"));

assertThrows(IllegalArgumentException.class, () ->
new Contact("12345", "Anthony", null,
"1234567890", "123 Main Street"));

assertThrows(IllegalArgumentException.class, () ->
new Contact("12345", "Anthony", "Edwards",
null, "123 Main Street"));

assertThrows(IllegalArgumentException.class, () ->
new Contact("12345", "Anthony", "Edwards",
"1234567890", null));
}
}
