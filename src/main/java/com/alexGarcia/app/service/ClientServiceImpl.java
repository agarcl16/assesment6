package com.alexGarcia.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexGarcia.app.repository.ClientRepository;

@Service
public class ClientServiceImpl {

	@Autowired
	private ClientRepository clientRepository;
}
