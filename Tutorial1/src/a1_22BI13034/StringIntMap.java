package a1_22BI13034;

import java.util.HashMap;
import utils.DOpt;
import utils.OptType;

/**
 * @overview StringIntMap is a mutable map that maps strings to integers.
 * @attributes 
 *  map HashMap<String, Integer>
 * @object A typical StringIntMap is c = {s1:i1, s2:i2, ..., sn:in}, where si (string), ii (integer)
 * @abstract_properties
 *  mutable(map)=true /\ optional(map)=false
 */
public class StringIntMap {
    private HashMap<String, Integer> map;

    public StringIntMap() {
        map = new HashMap<>();
    }

    /**
     * @effects add a new pair to the map
     * @param key
     * @param value
     */
    @DOpt(type=OptType.MutatorAdd)
    public void put(String key, int value) {
        map.put(key, value);
    }

    /**
     * @effects remove an existing pair from the map
     * @param key
     */
    @DOpt(type=OptType.MutatorRemove)
    public void remove(String key) {
        map.remove(key);
    }

    /**
     * @effects look up an existing mapping
     * @param key
     * @return the value to which the specified key is mapped, or null if this map contains no mapping for the key
     */
    public Integer get(String key) {
        return map.get(key);
    }
}
