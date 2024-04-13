package com.example.countrysearchdemo.services;

import com.example.countrysearchdemo.model.CountryInfo;

// Interface do Serviço
public interface CountryService {
    CountryInfo getCountryInfo(String code);
}
