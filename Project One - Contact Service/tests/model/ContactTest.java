package model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.DisplayName;


class ContactTest {
	
	@DisplayName("Valid Contact ID (1)")
    @Test
    public void testContactIDValid1() {
    	// Verify ID is set correctly
        Contact contact = new Contact("1", "John", "Smith", "1234567890", "123 Home St");
        assertEquals(1, contact.getContactID());
    }
	
	@DisplayName("Valid Contact ID (2)")
    @Test
    public void testContactIDValid2() {
    	// Verify ID is set correctly
        Contact contact = new Contact("12345", "John", "Smith", "1234567890", "123 Home St");
        assertEquals(12345, contact.getContactID());
    }
	
	@DisplayName("Valid Contact ID (3)")
    @Test
    public void testContactIDValid3() {
    	// Verify ID is set correctly
        Contact contact = new Contact("1234567890", "John", "Smith", "1234567890", "123 Home St");
        assertEquals(1234567890, contact.getContactID());
    }
    
	
	@DisplayName("Error when ID is null")
    @Test
	public void testContactIDInvalidNull() {
    	// ID is Null
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact(null, "John", "Smith", "1234567890", "123 Home St");
	    });
    }
	
	@DisplayName("Error when ID is empty")
    @Test
	public void testContactIDInvalidEmpty() {
    	// ID is Null
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("", "John", "Smith", "1234567890", "123 Home St");
	    });
    }
    
    @DisplayName("Error when ID over 10 char (1)")
    @Test
	public void testContactIDInvalidOverChar1() {
	    // ID is over 10 characters
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("12345678901", "John", "Smith", "1234567890", "123 Home St");
	    });
	}
    
    @DisplayName("Error when ID over 10 char (2)")
    @Test
	public void testContactIDInvalidOverChar2() {
	    // ID is over 10 characters
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("123456789012", "John", "Smith", "1234567890", "123 Home St");
	    });
	}
    
    @DisplayName("Error when ID over 10 char (3)")
    @Test
	public void testContactIDInvalidOverChar3() {
	    // ID is over 10 characters
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("123456789012345", "John", "Smith", "1234567890", "123 Home St");
	    });
	}

    @DisplayName("Valid first name set correctly (1)")
	@Test
	public void testFirstNameValid() {
		// Verify first name is set correctly
	    Contact contact = new Contact("12345", "Alexander", "Smith", "1234567890", "123 Home St");
	    assertEquals("Alexander", contact.getFirstName());
	}
    
    @DisplayName("Valid first name set correctly (2)")
	@Test
	public void testFirstNameValid2() {
		// Verify first name is set correctly
	    Contact contact = new Contact("12345", "John", "Smith", "1234567890", "123 Home St");
	    assertEquals("John", contact.getFirstName());
	}
    
    @DisplayName("Valid first name set correctly (3)")
	@Test
	public void testFirstNameValid3() {
		// Verify first name is set correctly
	    Contact contact = new Contact("12345", "J", "Smith", "1234567890", "123 Home St");
	    assertEquals("J", contact.getFirstName());
	}
	
    @DisplayName("Error when first name is null")
	@Test
	public void testFirstNameInvalidNull() {
		// First name is null
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("12345", null, "Smith", "1234567890", "123 Home St");
	    });
    }
    
    @DisplayName("Error when first name is empty")
	@Test
	public void testFirstNameInvalidEmpty() {
		// First name is null
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("12345", "", "Smith", "1234567890", "123 Home St");
	    });
    }
    
    @DisplayName("Error when first name is over 10 char (1)")
	@Test
	public void testFirstNameInvalidOverChar1() {
	    // First is over 10 characters
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("12345", "Joooooooohn", "Smith", "1234567890", "123 Home St");
	    });
	}
    
    @DisplayName("Error when first name is over 10 char (2)")
	@Test
	public void testFirstNameInvalidOverChar2() {
	    // First is over 10 characters
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("Christiansen", "", "Smith", "1234567890", "123 Home St");
	    });
	}
    
    @DisplayName("Error when first name is over 10 char (3)")
	@Test
	public void testFirstNameInvalidOverChar3() {
	    // First is over 10 characters
	    assertThrows(IllegalArgumentException.class, () -> {
	        new Contact("ChristiansenSmith", "", "Smith", "1234567890", "123 Home St");
	    });
	}

    @DisplayName("Valid last name set correctly (1)")
    @Test
    public void testLastNameValid1() {
    	// Verify last name is set correctly
        Contact contact = new Contact("12345", "John", "Smith", "1234567890", "123 Home St");
        assertEquals("Smith", contact.getLastName());
    }
    
    @DisplayName("Valid last name set correctly (2)")
    @Test
    public void testLastNameValid2() {
    	// Verify last name is set correctly
        Contact contact = new Contact("12345", "John", "Smitherson", "1234567890", "123 Home St");
        assertEquals("Smitherson", contact.getLastName());
    }
    
    @DisplayName("Valid last name set correctly (3)")
    @Test
    public void testLastNameValid3() {
    	// Verify last name is set correctly
        Contact contact = new Contact("12345", "John", "S", "1234567890", "123 Home St");
        assertEquals("S", contact.getLastName());
    }

    @DisplayName("Error when last name is null")
    @Test
    public void testLastNameInvalidNull() {
    	// Last name is null
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", null, "1234567890", "123 Home St");
        });
    }
    
    @DisplayName("Error when last name is empty")
    @Test
    public void testLastNameInvalidEmpty() {
    	// Last name is null
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "", "1234567890", "123 Home St");
        });
    }
    
    @DisplayName("Error when last name is over 10 char (1)")
    @Test
    public void testLastNameInvalidOverChar1() {
        // Last name is over 10 characters
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "Smiiiiiiith", "1234567890", "123 Home St");
        });
    }
    
    @DisplayName("Error when last name is over 10 char (2)")
    @Test
    public void testLastNameInvalidOverChar2() {
        // Last name is over 10 characters
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "Bartholomeus", "1234567890", "123 Home St");
        });
    }
    
    @DisplayName("Error when last name is over 10 char (3)")
    @Test
    public void testLastNameInvalidOverChar3() {
        // Last name is over 10 characters
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "JohnBartholomeus", "1234567890", "123 Home St");
        });
    }
    
    @DisplayName("Valid Phone number set correctly (1)")
    @Test
    public void testPhoneNumberValid1() {
    	// Verify phone number is set correctly
        Contact contact = new Contact("12345", "John", "Smith", "1234567890", "123 Home St");
        assertEquals("1234567890", contact.getPhoneNumber());
    }
    
    @DisplayName("Valid Phone number set correctly (2)")
    @Test
    public void testPhoneNumberValid2() {
    	// Verify phone number is set correctly
        Contact contact = new Contact("12345", "John", "Smith", "5282392823", "123 Home St");
        assertEquals("5282392823", contact.getPhoneNumber());
    }
    
    @DisplayName("Valid Phone number set correctly (3)")
    @Test
    public void testPhoneNumberValid3() {
    	// Verify phone number is set correctly
        Contact contact = new Contact("12345", "John", "Smith", "8002350987", "123 Home St");
        assertEquals("8002350987", contact.getPhoneNumber());
    }

    @DisplayName("Error when phone number is null")
    @Test
    public void testPhoneNumberInvalidNull() {
    	// Phone number is null
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "Smith", null, "123 Home St");
        });
    }
    
    @DisplayName("Error when phone number is empty")
    @Test
    public void testPhoneNumberInvalidEmpty() {
    	// Phone number is empty
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "Smith", "", "123 Home St");
        });
    }
    
    @DisplayName("Error when phone number is over 10 char (1)")
    @Test
    public void testPhoneNumberInvalidOverChar1() {
        // Phone number is over 10 characters
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "Smith", "12345678901", "123 Home St");
        });
    }
    
    @DisplayName("Error when phone number is over 10 char (2)")
    @Test
    public void testPhoneNumberInvalidOverChar2() {
        // Phone number is over 10 characters
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "Smith", "214124010982109438", "123 Home St");
        });
    }
    
    @DisplayName("Error when phone number is under 10 char (1)")
    @Test
    public void testPhoneNumberInvalidUnderChar1() {
        // Phone number is under 10 characters
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "Smith", "1", "123 Home St");
        });
    }
    
    @DisplayName("Error when phone number is under 10 char (2)")
    @Test
    public void testPhoneNumberInvalidUnderChar2() {
        // Phone number is under 10 characters
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "Smith", "123456789", "123 Home St");
        });
    }

    @DisplayName("Valid address set correctly (1)")
    @Test
    public void testAddressValid1() {
    	// Verify address is set correctly
        Contact contact = new Contact("12345", "John", "Smith", "1234567890", "123 Home St");
        assertEquals("123 Home St", contact.getAddress());
    }
    
    @DisplayName("Valid address set correctly (2)")
    @Test
    public void testAddressValid2() {
    	// Verify address is set correctly
        Contact contact = new Contact("12345", "John", "Smith", "1234567890", "home");
        assertEquals("home", contact.getAddress());
    }
    
    @DisplayName("Valid address set correctly (3)")
    @Test
    public void testAddressValid3() {
    	// Verify address is set correctly
        Contact contact = new Contact("12345", "John", "Smith", "1234567890", "1150 Morris Street North Drive");
        assertEquals("1150 Morris Street North Drive", contact.getAddress());
    }
    
    @DisplayName("Error when address is null")
    @Test
    public void testAddressInvalidNull() {
    	// Address is null
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "Smith", "1234567890", null);
        });
    }
    
    @DisplayName("Error when address is empty")
    @Test
    public void testAddressInvalidEmpty() {
    	// Address is null
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "Smith", "1234567890", "");
        });
    }
    
    @DisplayName("Error when address is over 30 char (1)")
    @Test
    public void testAddressInvalidOverChar1() {
        // Address is over 30 characters
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "Smith", "1234567890", "123 Home Street, Florida, 31001");
        });
    }
    
    @DisplayName("Error when address is over 30 char (2)")
    @Test
    public void testAddressInvalidOverChar2() {
        // Address is over 30 characters
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "Smith", "1234567890", "1150 Morris Street Victoria, TX 77901");
        });
    }
    
    @DisplayName("Error when address is over 30 char (3)")
    @Test
    public void testAddressInvalidOverChar3() {
        // Address is over 30 characters
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "John", "Smith", "1234567890", "3623 Cessna Drive Ave Fort Wayne");
        });
    }

}