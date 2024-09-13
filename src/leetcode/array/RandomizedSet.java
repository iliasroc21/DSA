package leetcode.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RandomizedSet {

    Set<Integer> set ;
    public RandomizedSet() {
        this.set= new HashSet<>();

    }

    public boolean insert(int val) {
        if(!set.contains(val)){
            set.add(val);
            return true;
        }
        return false;
    }

    public boolean remove(int val) {
        if(set.contains(val)){
            set.remove(val);
            return true;
        }
        return false;

    }

    public int getRandom() {
        List<Integer> list= new ArrayList<>(this.set);
        int random = (int)(Math.random()*set.size());
        return list.get(random);
    }
}
