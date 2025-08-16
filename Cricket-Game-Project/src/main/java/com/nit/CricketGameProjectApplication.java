package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nit.entity.Player;

@SpringBootApplication
public class CricketGameProjectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(CricketGameProjectApplication.class, args);
		
		Player player = ctx.getBean(Player.class);
		Player details = player.getPlayerDetils();
		System.out.println(details.getId() + " : " + details.getName() + " : " + details.getJearsyNumber());
	}

}
