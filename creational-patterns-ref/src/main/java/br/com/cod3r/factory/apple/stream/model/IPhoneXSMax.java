package br.com.cod3r.factory.apple.stream.model;

import lombok.Builder;

@Builder
public class IPhoneXSMax implements IPhone {

	@Override
	public void getHardware() {
		System.out.println("Hardware list");
		System.out.println("\t- 6.5in Screen");
		System.out.println("\t- A12 Chipset");
		System.out.println("\t- 4Gb RAM");
		System.out.println("\t- 512Gb Memory");
	}

	@Override
	public boolean supports(String modelo) {
		var valid = modelo.equalsIgnoreCase("XS Max");
		return valid;
	}
}
