package co.ie12.Ie12SampleMovie.web;

import co.ie12.Ie12SampleMovie.entity.Schedule;
import co.ie12.Ie12SampleMovie.repository.ScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/schedules")
public class ScheduleController {

    @Autowired
    ScheduleRepository scheduleRepository;

    @GetMapping
    public String list(Model model){
        List<Schedule> schedule = scheduleRepository.findAll();
        System.out.println(schedule.get(0).toString());
        model.addAttribute("schedules",schedule);
        return "schedules/list";
    }
}
