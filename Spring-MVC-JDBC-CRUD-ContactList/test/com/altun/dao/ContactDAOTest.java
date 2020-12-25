package com.altun.dao;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.altun.model.Contact;

class ContactDAOTest {
	private DriverManagerDataSource dataSource;
	private ContactDAO dao;

	@BeforeEach
	void setupBeforeEach() {
		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/contactDB");
		dataSource.setUsername("root");
		dataSource.setPassword("");
		dao = new ContactDAOImpl(dataSource);
	}

	@Test
	void testSave() {
		Contact contact = new Contact("Steve jobs", "steve@apple.com", "Cupertino, CA", "5252321978");
		Contact contact2 = new Contact("Elon Musk", "elon@tesla.com", "San Carlos, CA", "9039230230");
		int result = dao.save(contact);
		dao.save(contact2);
		assertTrue(result > 0);
	}

	@Test
	void testUpdate() {
		Contact contact = new Contact(1, "Bill Gates", "bill@microsoft.com", "Redmon, WA", "94039042948");
		int result = dao.update(contact);
		assertTrue(result > 0);
	}

	@Test
	void testGet() {
		Integer id = 1;
		Contact contact = dao.get(id);
		assertNotNull(contact);
	}

	@Test
	void testDelete() {
		Integer id = 2;
		int result = dao.delete(id);
		assertTrue(result > 0);
	}

	@Test
	void testList() {
		List<Contact> listContacts = dao.list();

		for (Contact aContact : listContacts) {
			System.out.print(aContact);
		}
		assertTrue(!listContacts.isEmpty());
	}

}
