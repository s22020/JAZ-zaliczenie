package pl.pjatk.jazs22020nbp.service;

import com.mysql.cj.xdevapi.JsonArray;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.pjatk.jazs22020nbp.model.Gold;
import pl.pjatk.jazs22020nbp.model.Rate;
import pl.pjatk.jazs22020nbp.repository.JazS22020NbpRepository;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Map;

@Service
public class JazS22020NbpService {

    private final JazS22020NbpRepository jazS22020NbpRepository;

    public JazS22020NbpService(JazS22020NbpRepository jazS22020NbpRepository) {
        this.jazS22020NbpRepository = jazS22020NbpRepository;
    }

    public String getNbpRate(LocalDate startDate, LocalDate endDate) {
        final String uri = "http://api.nbp.pl/api/cenyzlota/{startDate}/{endDate}";

        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(uri, String.class, startDate, endDate);
//        jazS22020NbpRepository.save(result);
        GsonJsonParser parser = new GsonJsonParser();
        Map a = parser.parseMap(result);
//        JsonObject data = new Gson().fromJson(jsonString, JsonObject.class);
//        JsonArray names = data.get("items").getAsJsonArray();
        Double resu = Double.parseDouble(result);
        Rate rate = new Rate(0, Gold.GOLD, startDate, endDate, resu, LocalDate.now(), LocalTime.now());
        saveRate(rate);
        return result;
    }

    public void saveRate(Rate rate) {
        jazS22020NbpRepository.save(rate);
    }
}
