import java.util.Map;
import java.util.TreeMap;

/**
 * Task ror lesson 4 SBT
 *
 * @author Hin7
 */

public class TestCountMap {
    public static void main(String[] args){
        CountMap<Integer> map = new ContMapImp<>();

        map.add(10);
        map.add(10);
        map.add(5);
        map.add(6);
        map.add(5);
        map.add(10);

        System.out.println("Размер = " + map.size());
        System.out.println("Пятерок " + map.getCount(5));
        System.out.println("Шестерок " + map.getCount(6));
        System.out.println("Десяток " + map.getCount(10));

        System.out.println("Десяток было " + map.remove(10));
        System.out.println("Десяток стало " + map.getCount(10));

        System.out.println(map.toMap());

        Map<Integer, Integer> nMap = new TreeMap<>();
        map.toMap(nMap);
        System.out.println(nMap);



    }
}
