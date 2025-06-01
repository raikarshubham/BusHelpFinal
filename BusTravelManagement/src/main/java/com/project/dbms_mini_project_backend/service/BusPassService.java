package com.project.dbms_mini_project_backend.service;

import com.project.dbms_mini_project_backend.entity.BusPass;
import com.project.dbms_mini_project_backend.repository.BusPassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusPassService {

    @Autowired
    private BusPassRepository busPassRepository;

    public BusPass getPassByUserId(Long userId) {
        // Fetching the BusPass for the given userId
        BusPass busPass = busPassRepository.findByUserId(userId);

        // If a bus pass is found, print each of its attributes
        if (busPass != null) {
            System.out.println("Fetched BusPass details for User ID " + userId + ":");
            System.out.println("ID: " + busPass.getId());
            System.out.println("Route: " + busPass.getRoute());
            System.out.println("Start Date: " + busPass.getStartDate());
            System.out.println("End Date: " + busPass.getEndDate());
            System.out.println("Status: " + busPass.getStatus());
            System.out.println("User ID: " + busPass.getUserId());
        } else {
            System.out.println("No bus pass found for User ID " + userId);
        }

        return busPass;
    }
}
