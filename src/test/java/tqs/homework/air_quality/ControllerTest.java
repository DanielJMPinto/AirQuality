package tqs.homework.air_quality;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import tqs.homework.air_quality.controller.AQController;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ControllerTest {
    @Autowired
    private AQController controller;

    @Test
    public void testController1(){
        controller = new AQController();
        String result = controller.index();
        assertEquals("redirect:/airquality/Aveiro", result);
    }

    @Test
    public void testController2(){
        controller = new AQController();
        String result = controller.airquality();
        assertEquals("redirect:/airquality/Aveiro", result);
    }

    @Test
    public void testPostRequest(){
        controller = new AQController();
        String city = "Madrid";
        String result = controller.showPage(city);
        assertEquals("redirect:/airquality/"+city, result);
    }

}
