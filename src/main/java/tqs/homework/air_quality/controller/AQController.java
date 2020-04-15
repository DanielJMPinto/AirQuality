package tqs.homework.air_quality.controller;

import tqs.homework.air_quality.model.AQResponse;
import tqs.homework.air_quality.model.Data;
import tqs.homework.air_quality.service.AQServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class AQController {
    private Map<Integer,String> vals;
    public AQController(){
        vals = new HashMap<>();
        vals.put(0, "None");
        vals.put(1, "Low");
        vals.put(2, "Moderate");
        vals.put(3, "High");
        vals.put(4, "Very High");
    }

    @Autowired
    private AQServiceImpl<AQResponse> AQService;

    @GetMapping(value = "/")
    public String index() {
        return "redirect:/airquality/Aveiro";
    }

    @GetMapping(value = "/airquality")
    public String airquality() {
        return "redirect:/airquality/Aveiro";
    }

    @GetMapping(value = "/airquality/{city_name}")
    public String getAirQuality(Model model, @PathVariable("city_name") String city_name) throws Exception {

        AQResponse aqresponse = AQService.getAirQuality(city_name);
        List<Data> data = aqresponse.getData();
        String unit = " µg/m³";


        model.addAttribute("city_name", city_name);
        model.addAttribute("mold_level", vals.get(data.get(0).getMold_level()));
        model.addAttribute("aqi", data.get(0).getAqi());
        model.addAttribute("pm10", String.valueOf(data.get(0).getPm10()) + unit);
        model.addAttribute("co", String.valueOf(data.get(0).getCo()) + unit);
        model.addAttribute("o3", String.valueOf(data.get(0).getO3()) + unit);
        model.addAttribute("predominant_pollen_type", data.get(0).getPredominant_pollen_type());
        model.addAttribute("so2", String.valueOf(data.get(0).getSo2()) + unit);
        model.addAttribute("pollen_level_tree", vals.get(data.get(0).getPollen_level_tree()));
        model.addAttribute("pollen_level_weed", vals.get(data.get(0).getPollen_level_weed()));
        model.addAttribute("no2", String.valueOf(data.get(0).getNo2()) + unit);
        model.addAttribute("pm25", String.valueOf(data.get(0).getPm25()) + unit);
        model.addAttribute("pollen_level_grass", vals.get(data.get(0).getPollen_level_grass()));

        return "airquality";
    }

    @PostMapping("/choosecity")
    public String showPage(@ModelAttribute("city") String city) {
        return "redirect:/airquality/"+city;

    }
}
