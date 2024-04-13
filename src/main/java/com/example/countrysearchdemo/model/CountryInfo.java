package com.example.countrysearchdemo.model;

import lombok.*;

import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CountryInfo {
    private String name;
    private List<String> tld;
    private String cca2;
    private String ccn3;
    private String cca3;
    private String cioc;
    private boolean independent;
    private String status;
    private boolean unMember;
    private Map<String, Map<String, String>> currencies;
    private String callingcode;
    private List<String> capital;
    private List<String> altSpellings;
    private String region;
    private String subregion;
    private List<String> continents;
    private Map<String, String> languages;
    private List<Double> latlng;
    private boolean landlocked;
    private List<String> borders;
    private int area;
    private int population;
}
