package br.com.cod3r.factory.apple.stream;


import br.com.cod3r.factory.apple.stream.factory.InstaceOfListIphones;
import br.com.cod3r.factory.apple.stream.factory.IphoneStreamFactory;

import java.util.List;


public class Client {


    public static void main(String[] args) {
        var factory = new IphoneStreamFactory(InstaceOfListIphones.iPhones()
        );
        System.out.println("### Ordering an iPhone X");
        var iphone =factory.build("X");
        System.out.println(iphone);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        var iphone2 = factory.build("11 Pro");
        System.out.println(iphone2);
    }
}
