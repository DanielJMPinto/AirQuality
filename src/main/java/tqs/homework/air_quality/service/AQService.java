package tqs.homework.air_quality.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;
import tqs.homework.air_quality.model.AQResponse;

import javax.annotation.PostConstruct;

@Service
public class AQService implements AQServiceImpl<AQResponse> {

    private UriComponentsBuilder urlbuilder;

    @PostConstruct
    protected void init() {

        urlbuilder = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("api.weatherbit.io/")
                .path("/v2.0/current/airquality")
                .queryParam("city", "Aveiro")
                .queryParam("key", "887e0b117b414dccac1d127a785deab9");
    }


    @Override
    @Cacheable("city_airquality")
    public AQResponse getAirQuality(String city_name) {

        String url = urlbuilder.replaceQueryParam("city", city_name).build().toUriString();
        return new RestTemplate().getForObject(url, AQResponse.class);
    }
}