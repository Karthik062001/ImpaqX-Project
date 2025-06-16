package com.example.SpringB_Rest_Template.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.example.SpringB_Rest_Template.entity.User;

@Component
public class RestClient {

	private static final String GET_ALL_USER = "http://localhost:8080/api/newuser/all";
	private static final String GET_ONE_USER = "http://localhost:8080/api/newuser/{id}";
	private static final String SAVE_USER = "http://localhost:8080/api/newuser/save";
	private static final String UPDATE_USER = "http://localhost:8080/api/newuser/update/{id}";
	private static final String DELETE_USER = "http://localhost:8080/api/newuser/{userid}";

	@Autowired
	RestTemplate restTemplate ;


	public ResponseEntity<String> callAllUsers() {
		return restTemplate.getForEntity(GET_ALL_USER, String.class);
	}

	public ResponseEntity<String> callAllUSer() {
		HttpHeaders header = new HttpHeaders();
		header.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

		HttpEntity<String> entity = new HttpEntity<>("parameters", header);

		return restTemplate.exchange(GET_ALL_USER, HttpMethod.GET, entity, String.class);
		
	}

	public Object getOneUser(int id) {
		try {
			return restTemplate.getForObject(GET_ONE_USER, Object.class, id);
		} catch (HttpClientErrorException e) {
			return null; 
		}
	}

	public Object postUser(User user) {
		try {
			return restTemplate.postForEntity(SAVE_USER, user, String.class);
		} catch (Exception e) {
			return "Failed to create user: " + e.getMessage();
		}
	}

	public boolean updateUser(int id, User user) {
		try {
			restTemplate.put(UPDATE_USER, user, id);
			return true;
		} catch (HttpClientErrorException e) {
			return false;
		}
	}

	public boolean deleteUser(int id) {
		try {
			restTemplate.delete(DELETE_USER, id);
			return true;
		} catch (HttpClientErrorException e) {
			return false;
		}
	}
}
