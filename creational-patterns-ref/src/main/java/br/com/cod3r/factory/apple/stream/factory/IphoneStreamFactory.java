package br.com.cod3r.factory.apple.stream.factory;
import br.com.cod3r.factory.apple.stream.model.IPhone;
import lombok.RequiredArgsConstructor;

import java.util.List;


@RequiredArgsConstructor
public class IphoneStreamFactory {

    private final List<IPhone> iPhones;

    public IPhone build(String modelo){
        return this.iPhones.stream()
                .filter(s-> s.supports(modelo))
                .findFirst()
                .orElseThrow();
    }

}
