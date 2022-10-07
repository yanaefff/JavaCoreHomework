package homework4;

import java.util.*;

public class Main {

    static ArrayList<String> array = new ArrayList<>();

    public static void main(String[] args) {


        array.add("Михаил");
        array.add("Владимир");
        array.add("Валентин");
        array.add("Петр");
        array.add("Максим");
        array.add("Александр");
        array.add("Василий");
        array.add("Петр");
        array.add("Михаил");
        array.add("Леонид");
        array.add("Валентин");
        array.add("Роман");
        array.add("Олег");
        array.add("Михаил");
        array.add("Александр");
        System.out.println(array);

        Set<String> set = new HashSet<>();


        ListIterator<String> iteratorAr = array.listIterator();

        while (iteratorAr.hasNext()) {
            set.add(iteratorAr.next());
        }

        System.out.println(set);

        Iterator<String> iteratorSet = set.iterator();

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String setEl : set) {
            hashMap.put(setEl, toCount(setEl));
        }

        System.out.println(hashMap);
    }

        public static Integer toCount(String el) {
            int count = 0;
            for (String arEl : array) {
                if (arEl.equals(el)) count++;
            } return count;
        }
    }
