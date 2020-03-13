/**
 * Task ror lesson 4 SBT
 *
 * @author Hin7
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class ContMapImp<T> implements CountMap<T> {

    HashMap<T, Integer> data = new HashMap<>();

    // добавляет элемент в этот контейнер.
    @Override
    public void add(T element) {
        data.merge(element, 1, Integer::sum);
    }

    //Возвращает количество добавлений данного элемента
    public int getCount(T element) {
        return (int) data.get(element);
    }

    //Удаляет элемент и контейнера и возвращает количество его добавлений(до удаления)
    public int remove(T element) {
        Integer val = data.get(element);
        if (val == null) return 0;
        if (val == 1) return (int) data.remove(element);
        data.replace(element, val - 1);
        return val;
    }

    //количество разных элементов
    public int size() {
        return data.size();
    }

    //Добавить все элементы из source в текущий контейнер, при совпадении ключей, суммировать значения
    public void addAll(CountMap<T> source) {
        for (T key : (Set<T>) source.toMap().keySet()) {
            Integer val = data.get(key);
            if (val == null)
                data.put(key, source.getCount(key));
            else
                data.replace(key, val + source.getCount(key));
        }
    }


    //Вернуть java.util.Map. ключ - добавленный элемент, значение - количество его добавлений
    public Map toMap(){
        return data;
    }

    //Тот же самый контракт как и toMap(), только всю информацию записать в destination
    public void toMap(Map<? super T, Integer> destination){
        destination.putAll(data);
    }
}
