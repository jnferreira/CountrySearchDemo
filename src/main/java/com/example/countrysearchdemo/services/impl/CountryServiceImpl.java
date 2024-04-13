package com.example.countrysearchdemo.services.impl;

import com.example.countrysearchdemo.model.CountryInfo;
import com.example.countrysearchdemo.services.CountryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class CountryServiceImpl implements CountryService {
    private final RestTemplate restTemplate;

    public CountryServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public CountryInfo getCountryInfo(String code) {
        String url = "https://countryinfoapi.com/api/countries/name/" + code;
        try {
            return restTemplate.getForObject(url, CountryInfo.class);
        } catch (Exception e) {
            // Create an Exception...
            log.error("Error occurred while fetching country info", e);
            return null;
        }
    }
}
