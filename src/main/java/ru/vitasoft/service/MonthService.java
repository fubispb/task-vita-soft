package ru.vitasoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class MonthService {

    private final List<String> monthsRusName = Arrays.asList("Я-Н-В-А-Р-Ь", "Ф-Е-В-Р-А-Л-Ь", "М-А-Р-Т", "А-П-Р-Е-Л-Ь", "М-А-Й", "И-Ю-Н-Ь",
            "И-Ю-Л-Ь", "А-В-Г-У-С-Т", "С-Е-Н-Т-Я-Б-Р-Ь", "О-К-Т-Я-Б-Р-Ь", "Н-О-Я-Б-Р-Ь", "Д-Е-К-А-Б-Р-Ь");

    public String getMonths(int index) {
        return monthsRusName.get(index-1);
    }
}