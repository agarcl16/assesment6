package com.alexGarcia.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexGarcia.app.repository.ContactRepository;

@Service
public class ContactServiceImpl {

	@Autowired
	private ContactRepository contactRepository;
}
