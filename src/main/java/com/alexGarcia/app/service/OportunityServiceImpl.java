package com.alexGarcia.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexGarcia.app.repository.OportunityRepository;

@Service
public class OportunityServiceImpl {

	@Autowired
	private OportunityRepository oportunityRepository;
}
