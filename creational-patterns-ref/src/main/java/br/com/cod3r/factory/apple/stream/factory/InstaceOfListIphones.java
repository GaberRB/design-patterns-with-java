package br.com.cod3r.factory.apple.stream.factory;

import br.com.cod3r.factory.apple.stream.model.*;

import java.util.ArrayList;
import java.util.List;

public class InstaceOfListIphones {

    public static List<IPhone> iPhones(){
        List<IPhone> iPhones = new ArrayList<>();

        iPhones.add(IPhone11.builder().build());
        iPhones.add(IPhoneX.builder().build());
        iPhones.add(IPhone11Pro.builder().build());
        iPhones.add(IPhoneXSMax.builder().build());

        return iPhones;
    }
}
