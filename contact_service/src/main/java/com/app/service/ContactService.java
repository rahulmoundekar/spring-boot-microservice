package com.app.service;

import java.util.List;

import com.app.entity.Contact;

public interface ContactService {

	public List<Contact> getContactsOfUser(Long userId);

}
