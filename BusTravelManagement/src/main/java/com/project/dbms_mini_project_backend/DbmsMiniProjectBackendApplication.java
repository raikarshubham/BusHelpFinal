package com.project.dbms_mini_project_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbmsMiniProjectBackendApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(DbmsMiniProjectBackendApplication.class, args);
		} catch (Throwable t) {
			t.printStackTrace(); // force printing any silent error
		}
	}

}

