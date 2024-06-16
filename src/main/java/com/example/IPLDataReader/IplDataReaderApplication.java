package com.example.IPLDataReader;

import com.example.IPLDataReader.Services.PushDB;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan(basePackages = "com.example.IPLDataReader")
public class IplDataReaderApplication {

	public static void main(String[] args) {
		//SpringApplication.run(IplDataReaderApplication.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(IplDataReaderApplication.class, args);
		PushDB pushDB = context.getBean(PushDB.class);
		pushDB.processCSVData();
		pushDB.InsertBatsmanRecord();
		pushDB.InsertBowlingRecord();
	}

}
