package creational.prototype_pattern;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElectronicoCache {
    private final Map<String, Electronico> cache = new HashMap<>();

    public ElectronicoCache(){
        Computadora computadora = new Computadora("Satellite", "S-4a", "Black", "350");
        Tablet tablet = new Tablet("Amazon", "a-22f", "Gray", "7");

        cache.put("Satellite", computadora);
        cache.put("Amazon", tablet);
    }

    public Electronico get(String key){
        return cache.get(key).clone();
    }

    public void put(List<Electronico> electronicos){
        electronicos.forEach(electronico -> cache.put(electronico.getMarca() + " " + electronico.getModelo(), electronico));
    }
}
