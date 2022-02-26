package com.softwell.soft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softwell.soft.Exceptions.EmailExistsException;
import com.softwell.soft.model.Client;
import com.softwell.soft.repository.ClientRepository;

@Service
public class ServiceClient {
		
		
		@Autowired
		private ClientRepository repository;
	
		public void  salvarClient(Client client) throws Exception {
			
			try {
				if(repository.findByEmail(client.getEmail()) != null) {
					throw new EmailExistsException("Usuário já cadastrado!");
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			repository.save(client);
			
		}
}
