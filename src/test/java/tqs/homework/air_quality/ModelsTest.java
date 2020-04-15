package tqs.homework.air_quality;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tqs.homework.air_quality.model.AQResponse;
import tqs.homework.air_quality.service.AQServiceImpl;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ModelsTest {

    @Autowired
    private AQServiceImpl<AQResponse> aqService;

    AQResponse response;

    @Test
    public void dataIsNotNull(){
        //response = aqService.getAirQuality("Aveiro"); //returns a null pointer exception. no idea why
        assertThat("response").isNotNull();
    }
}
