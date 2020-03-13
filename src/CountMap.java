/**
 * Task ror lesson 4 SBT
 * @author Hin7
 */

import java.util.Map;


public interface CountMap<T> {
    // добавляет элемент в этот контейнер.
    public void add(T element);

    //Возвращает количество добавлений данного элемента
    public int getCount(T element);

    //Удаляет элемент и контейнера и возвращает количество его добавлений(до удаления)
    public int remove(T element);

    //количество разных элементов
    public int size();

    //Добавить все элементы из source в текущий контейнер, при совпадении ключей,     суммировать значения
    public void addAll(CountMap<T> source);

    //Вернуть java.util.Map. ключ - добавленный элемент, значение - количество его добавлений
    public Map<T, Integer> toMap();

    //Тот же самый контракт как и toMap(), только всю информацию записать в destination
    public void toMap(Map<? super T, Integer> destination);
}
