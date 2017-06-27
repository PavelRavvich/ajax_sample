package ru.pravvich;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

/**
 * Convert to JSON.
 */
public class JsonConverter {

    public String getAllCity(final String country) {
        final List<String> list = new ArrayList<>();

        if (country.equals("USA")) {
            list.add("New York");
            list.add("Boston");
            list.add("Chicago");
            list.add("Dallas");
        } else if (country.equals("Israel")) {
            list.add("Jerusalem");
            list.add("Tel Aviv");
            list.add("Haifa");
            list.add("Ashdod");
        } else if (country.equals("Select Country")) {
            list.add("Select Country");
        }

        return new Gson().toJson(list);
    }

}
