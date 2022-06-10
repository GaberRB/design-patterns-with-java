package br.com.cod3r.factory.apple.stream.model;

import lombok.Builder;

@Builder
public class IPhone11Pro implements IPhone {

	@Override
	public void getHardware() {
		System.out.println("Hardware list");
		System.out.println("\t- 6.5in Screen");
		System.out.println("\t- A13 Chipset");
		System.out.println("\t- 4Gb RAM");
		System.out.println("\t- 512Gb Memory");
	}

	@Override
	public boolean supports(String modelo) {
		var valid = modelo.equalsIgnoreCase("11 pro");
		return valid;
	}
}
