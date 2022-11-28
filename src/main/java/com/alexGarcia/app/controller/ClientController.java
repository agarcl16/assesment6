package com.alexGarcia.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alexGarcia.app.service.ClientService;

@RestController
@RequestMapping("/api/users")
public class ClientController {

	@Autowired
	private ClientService clientService;
}
