package Chapter11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Write a method contains3 that accepts a list of strings as a parameter and returns true if any single string occurs
at least 3 times in the list, and false otherwise. Use a map as auxiliary storage.
 */
public class Exercise12 {
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();

        list.add("ninja");
        list.add("ninja");
        list.add("ninja");
        list.add("lol");
        list.add("will");
        list.add("crow");
        list.add("bored");

        Exercise12 exercise12 = new Exercise12();
        System.out.println(exercise12.contains3(list));
    }

    private boolean contains3(List<String> list)
    {
        if (list.size() < 3) return false;
        else
        {
            Map<String, Integer> result = new HashMap<>();
            for (String word:list)
            {
                if (result.containsKey(word))
                {
                    result.put(word, result.get(word)+1);
                }
                else result.put(word, 1);

                if (result.get(word) >= 3) return true;
            }
        }
        return false;
    }
}
