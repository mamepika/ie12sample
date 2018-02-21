package co.ie12.Ie12SampleMovie.web;

import co.ie12.Ie12SampleMovie.entity.Schedule;
import co.ie12.Ie12SampleMovie.repository.ScheduleRepository;
import co.ie12.Ie12SampleMovie.service.CalculatePriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Controller
@RequestMapping("/schedules")
public class ScheduleController {

    @Autowired
    ScheduleRepository scheduleRepository;


    @GetMapping
    public String list(Model model){
        List<Schedule> schedule = scheduleRepository.findByShowDay(LocalDate.now());
        model.addAttribute("schedules",schedule);
        model.addAttribute("schedules",schedule);
        return "schedules/list";
    }

    @PostMapping
    public String showDayList(@RequestParam String  showDay,Model model){
        System.out.println(showDay);
        List<Schedule> schedule = scheduleRepository.findByShowDay(LocalDate.parse(showDay, DateTimeFormatter.ofPattern("yyyy/MM/dd")));
        model.addAttribute("schedules",schedule);
        return "schedules/list";
    }

    @PostMapping("/buy")
    public String buy(@RequestParam Integer id,Model model){
        Schedule schedule = scheduleRepository.findById(id);
        CalculatePriceService priceService = new CalculatePriceService(schedule);
        schedule.setPrice(priceService.calculatePrice());
        model.addAttribute("schedule",schedule);
        return "schedules/buy";
    }
}
