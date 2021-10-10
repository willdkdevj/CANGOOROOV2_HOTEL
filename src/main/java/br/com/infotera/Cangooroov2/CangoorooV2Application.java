package br.com.infotera.Cangooroov2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CangoorooV2Application {

	public static String version = "Cangooroo (v2) ON - version (POM): ";

	public static void main(String[] args) {
	//	Utils.setTpAmbiente("H");
	//	if(args.length > 0)
	//		Utils.setTpAmbiente(args[0]);

		version += CangoorooV2Application.class.getPackage().getImplementationVersion();
		SpringApplication.run(CangoorooV2Application.class, args);
	}

}
