package br.com.cod3r.factory.apple.stream.model;

import lombok.Builder;

@Builder
public class IPhoneX implements IPhone {

	@Override
	public void getHardware() {
		System.out.println("Hardware list");
		System.out.println("\t- 5.8in Screen");
		System.out.println("\t- A11 Chipset");
		System.out.println("\t- 3Gb RAM");
		System.out.println("\t- 256Gb Memory");
	}

	@Override
	public boolean supports(String modelo) {
		var valid = modelo.equalsIgnoreCase("X");
		return valid;
	}
}
