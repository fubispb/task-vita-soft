package ru.vitasoft.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Service
public class StringService {

    public Map<Integer, String> sortStrings(List<String> str) {
        str.sort((s1, s2) -> {
            if (s1.length() != s2.length())
                return s1.length() - s2.length();
            else
                return s1.compareTo(s2);
        });
        Map<Integer, String> map = new TreeMap<>();
        for (String s : str) {
            map.put(s.length(), s);
        }
        return map;
    }
}
