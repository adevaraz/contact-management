package mainpackage;

import java.awt.List;

public class Display {
	ContactAppService service;
	public Display(ContactAppService service) {
		this.service = service;
	}

	public void displayMenu() {
		System.out.println("==Menu==");
        System.out.println("1. Print Contacts");
        System.out.println("2. Add Contact");
        System.out.println("3. Search Contact");
        System.out.println("4. Edit Contact");
        System.out.println("5. Delete Contact");
        System.out.println("0. Exit");
	}
	public void displayAllFavorite(String[] fields, String[] info) {
		List<Contact> favContact = service.getFavoriteContact();
		for (int i = 0; i < favContact.length; i++ ) {
            System.out.println(fields[i] +": "+ info[i]);					
	}
	}
	public void displayAllUrgent(String[] fields, String[] info) {
		List<Contact> urgentContact = service.getUrgentContact();
		for (int i = 0; i < urgentContact.length; i++ ) {
            System.out.println(fields[i] +": "+ info[i]);					
	}
	}
}