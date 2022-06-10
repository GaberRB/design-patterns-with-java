package br.com.cod3r.factory.apple.stream.model;

public interface IPhone {
	
	public void getHardware();

	public default void assemble() {
		System.out.println("Assembling all the hardwares");
	}

	public default void certificates() {
		System.out.println("Testing all the certificates");
	}

	public default void pack() {
		System.out.println("Packing the device");
	}

	public boolean supports(String modelo);
}
