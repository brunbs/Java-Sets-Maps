import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*  Set: conjunto de objetos que não podem ter duplicatas
    utilizam os mesmos métodos que o ArrayList com exceção daqueles que recebem índices como parâmetros
    Sets não são ordenados

    As duas classes principais que implementam Set são HashSet e TreeSet (quando ordenação é importante)

*/



public class CriandoSetsEMaps {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        System.out.println(set.add(66)); // true
        System.out.println(set.add(66)); // false pois não adiciona valores duplicados
        System.out.println(set.size()); // 1
        set.remove(66);
        System.out.println(set.isEmpty()); // true

        System.out.println("#####################");

/*  Maps: usa chave para identificar valores. Implementação mais comum: HashMap
    Alguns métodos são comuns ao ArrayList, como clear(), isEmpty(), size().
    Há métodos específicos para lidar com chave-valor

    MÉTODO                                      DESCRIÇÃO
    -------------------------------------------------------------------------------------------
    V get(Object key)                      |     Retorna o valor relacionado à chave ou null
    V getOrDefault(Object key, V other)    |     Retorna o valor relacionado à chave ou other se não há
    V put(K key, V value)                  |     Adiciona ou substitui o par chave-valor. Retorna o valor anterior ou null
    V remove(Object key)                   |     Remove e retorna o valor mapeado pela chave. Retorna null se não existia
    boolean constainsKey(Object key)       |     Retorna se existe a chave no map
    boolean containsValue(Object key)      |     Retorna se tem o valor no map
    Set<K> keySet()                        |     Retorna set de todas as chaves
    Collection<V> values()                 |     Retorna Collection de todos os valores
*/

        Map<String, String> map = new HashMap<>();
        map.put("koala", "bamboo");
        String food = map.get("koala"); // bamboo
        String other = map.getOrDefault("ant", "leaf"); // leaf
        map.put("bruno" , "pizza");
        for (String key: map.keySet()) {
            System.out.println(key + " " + map.get(key)); // koala bamboo // bruno pizza
        }
        System.out.println(other);

    }
}
