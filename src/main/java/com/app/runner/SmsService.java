package com.app.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
@Component
@Profile("Sms")
public class SmsService implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("SMS Service Profile");

	}

}
