package com.project.dbms_mini_project_backend.controller;

import com.project.dbms_mini_project_backend.entity.BusPass;
import com.project.dbms_mini_project_backend.service.BusPassService;
import com.project.dbms_mini_project_backend.repository.BusPassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;

@Controller
public class BusPassController {

    @Autowired
    private BusPassRepository busPassRepository;

    @Autowired
    private BusPassService busPassService;

    // Serve the HTML file manually
    /*@GetMapping("/buspass/apply")
    public String applyPage() {
        return "redirect:/apply_pass.html"; // static file inside /static/
    }*/

    @GetMapping("/buspass/details/{id}")
    @ResponseBody
    public BusPass getBusPassDetails(@PathVariable Long id) {
        return busPassRepository.findById(id).orElse(null);
    }


    // Handle the form submission
    /*@PostMapping("/buspass/apply")
    public String applyBusPass(@RequestParam("route") String route,
                               @RequestParam("startDate") String startDate,
                               @RequestParam("endDate") String endDate,
                               @RequestParam("userId") Long userId) {

        BusPass busPass = new BusPass();
        busPass.setRoute(route);
        busPass.setStartDate(LocalDate.parse(startDate));
        busPass.setEndDate(LocalDate.parse(endDate));
        busPass.setUserId(userId);
        busPassRepository.save(busPass);

        return "redirect:/apply_pass.html"; // Go back after submit
    }*/
    @PostMapping("/buspass/apply")
    public String applyBusPass(@RequestParam("route") String route,
                               @RequestParam("startDate") String startDate,
                               @RequestParam("endDate") String endDate,
                               @RequestParam("userId") Long userId) {

        BusPass busPass = new BusPass();
        busPass.setRoute(route);
        busPass.setStartDate(LocalDate.parse(startDate));
        busPass.setEndDate(LocalDate.parse(endDate));
        busPass.setUserId(userId);
        busPassRepository.save(busPass);

        return "redirect:/pass_details.html?id=" + busPass.getId();
    }

    /*@GetMapping("/api/buspass/user/{userId}")
    public BusPass getPassByUserId(@PathVariable Long userId) {
        return busPassService.getPassByUserId(userId);
    }
    */
    @GetMapping("/api/buspass/user/{userId}")
    public ResponseEntity<BusPass> getPassByUserId(@PathVariable Long userId) {
        BusPass busPass = busPassService.getPassByUserId(userId);
        if (busPass == null) {
            return ResponseEntity.status(404).body(null);  // Return 404 if no bus pass is found
        }
        return ResponseEntity.ok(busPass);  // Return the BusPass object if found
    }



}
