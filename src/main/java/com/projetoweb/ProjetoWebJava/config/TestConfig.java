package com.projetoweb.ProjetoWebJava.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetoweb.ProjetoWebJava.entities.Order;
import com.projetoweb.ProjetoWebJava.entities.User;
import com.projetoweb.ProjetoWebJava.entities.enums.OrderStatus;
import com.projetoweb.ProjetoWebJava.repositories.OrderRepository;
import com.projetoweb.ProjetoWebJava.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User user1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User user2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		User user3 = new User(null, "Juliana Ros", "juliana@gmail.com", "999922233", "30052024");
		
		Order order1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, user1); 
		Order order2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, user2); 
		Order order3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.DELIVERED, user3); 


		userRepository.saveAll(Arrays.asList(user1, user2, user3));
		orderRepository.saveAll(Arrays.asList(order1, order2, order3));
	}
}