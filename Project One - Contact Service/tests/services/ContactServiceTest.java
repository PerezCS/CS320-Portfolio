package services;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import model.Contact;
import service.ContactService;

public class ContactServiceTest {

    private ContactService contactService;

    // New instance of contact list for each test case
    @BeforeEach
    public void setUp() {
        contactService = new ContactService();
        // Clear the contact list before each test
        ContactService.contactList.clear();
    }

    @DisplayName("Verify new valid contact is added correctly")
    @Test
    public void testAddContact() {
    	// Verify new contact is added correctly
        contactService.addContact("John", "Smith", "1234567890", "123 Home St");
        assertFalse(ContactService.contactList.isEmpty(), "Contact list should not be empty after adding a contact.");
        assertEquals(1, ContactService.contactList.size(), "Contact list should have one contact.");
    }
    

    @DisplayName("Verify new valid contact is deleted correctly")
    @Test
    public void testDeleteContact() {
    	// Verify new contact is deleted correctly using its ID
        contactService.addContact("John", "Smith", "1234567890", "123 Home St");
        int idToDelete = ContactService.contactList.get(0).getContactID();
        contactService.deleteContact(String.valueOf(idToDelete));
        assertTrue(ContactService.contactList.isEmpty(), "Contact list should be empty after deleting the contact.");
    }

    @DisplayName("Edit first name of existing contact is successful")
    @Test
    public void testEditFirstName() {
    	// Change existing contact's first name works correctly
        contactService.addContact("John", "Smith", "1234567890", "123 Home St");
        int contactID = ContactService.contactList.get(0).getContactID();
        contactService.editFirstName(String.valueOf(contactID), "Jane");
        assertEquals("Jane", ContactService.contactList.get(0).getFirstName(), "First name should be updated to Jane.");
    }

    @DisplayName("Edit last name of existing contact is successful")
    @Test
    public void testEditLastName() {
    	// Change existing contact's last name works correctly
        contactService.addContact("John", "Smith", "1234567890", "123 Home St");
        int contactID = ContactService.contactList.get(0).getContactID();
        contactService.editLastName(String.valueOf(contactID), "Smithy");
        assertEquals("Smithy", ContactService.contactList.get(0).getLastName(), "Last name should be updated to Smith.");
    }

    @DisplayName("Edit phone number of existing contact is successful")
    @Test
    public void testEditNumber() {
    	// Change existing contact's phone number works correctly
        contactService.addContact("John", "Smith", "1234567890", "123 Home St");
        int contactID = ContactService.contactList.get(0).getContactID();
        contactService.editNumber(String.valueOf(contactID), "0987654321");
        assertEquals("0987654321", ContactService.contactList.get(0).getPhoneNumber(), "Phone number should be updated.");
    }

    @DisplayName("Edit address of existing contact is successful")

    @Test
    public void testEditAddress() {
    	// Change existing contact's address works correctly
        contactService.addContact("John", "Smith", "1234567890", "123 Home St");
        int contactID = ContactService.contactList.get(0).getContactID();
        contactService.editAddress(String.valueOf(contactID), "321 Home St");
        assertEquals("321 Home St", ContactService.contactList.get(0).getAddress(), "Address should be updated.");
    }

    @DisplayName("Verify list of contacts have unique IDs")
    @Test
    public void testUniqueContactIDs() {
        ContactService service = new ContactService();
        Set<String> ids = new HashSet<>();

        // Add contacts
        service.addContact("John", "Doe", "1234567890", "123 Home St");
        service.addContact("Jane", "Doe", "0987654321", "456 Home St");
        service.addContact("Alice", "Smith", "1112223333", "789 Home St");
        service.addContact("Bob", "Brown", "4445556666", "452 Home St");
        service.addContact("Fred", "Bob", "3498272823", "012 Home St");

        // Check for unique IDs
        for (Contact contact : ContactService.contactList) {
            String idStr = String.valueOf(contact.getContactID()); // Convert ID to String
            assertFalse(ids.contains(idStr));
            ids.add(idStr);
        }

        assertTrue(ids.size() == ContactService.contactList.size());
    }
}