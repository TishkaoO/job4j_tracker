package search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список пользователей, которые прошли проверку.
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> combineName = s -> s.getName().contains(key);
        Predicate<Person> combineSurname = k -> k.getSurname().contains(key);
        Predicate<Person> combinePhone = y -> y.getPhone().contains(key);
        Predicate<Person> combineAddress = z -> z.getAddress().contains(key);
        Predicate<Person> combine = combineName.or(combineSurname).or(combinePhone).or(combineAddress);
        ArrayList<Person> result = new ArrayList<>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
