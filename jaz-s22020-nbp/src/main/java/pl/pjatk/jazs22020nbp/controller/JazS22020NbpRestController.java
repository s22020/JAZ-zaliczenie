package pl.pjatk.jazs22020nbp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.jazs22020nbp.model.Rate;
import pl.pjatk.jazs22020nbp.service.JazS22020NbpService;

import java.time.LocalDate;
import java.util.Date;

@RestController
@RequestMapping("/api")
public class JazS22020NbpRestController {
    //http://api.nbp.pl/api/cenyzlota/{startDate}/{endDate}
    private final JazS22020NbpService jazS22020NbpService;
    public JazS22020NbpRestController(JazS22020NbpService jazS22020NbpService) {
        this.jazS22020NbpService = jazS22020NbpService;
    }

//    @GetMapping("/{startDate}/{endDate}")
@GetMapping("/rate")
public ResponseEntity<String> getRate(@RequestParam String startdate, @RequestParam String enddate) {
//        String b = "asd";
        LocalDate a = LocalDate.parse(startdate);
        LocalDate b = LocalDate.parse(enddate);
        return ResponseEntity.ok(jazS22020NbpService.getNbpRate(a, b));
//        return ResponseEntity.ok(jazS22020NbpService.getNbpRate(startdate, enddate));
    }
}
