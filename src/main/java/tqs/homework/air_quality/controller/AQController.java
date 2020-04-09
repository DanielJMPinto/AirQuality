package tqs.homework.air_quality.controller;

import tqs.homework.air_quality.model.AQResponse;
import tqs.homework.air_quality.service.AQServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@Controller
public class AQController {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AQServiceImpl<AQResponse> AQService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "redirect:/airquality/Aveiro";
    }

    @RequestMapping(value = "/airquality/{city_name}", method = RequestMethod.GET)
    public String getAirQuality(Model model, @PathVariable("city_name") String city_name) throws Exception {

        AQResponse aqresponse = AQService.getAirQuality(city_name);
        model.addAttribute("city_name", city_name);
        model.addAttribute("data", aqresponse.getData());

        return "airquality";

    }
}
