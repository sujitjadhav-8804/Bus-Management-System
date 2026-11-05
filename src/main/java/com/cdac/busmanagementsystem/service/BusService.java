
package com.cdac.busmanagementsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdac.busmanagementsystem.entity.Bus;
import com.cdac.busmanagementsystem.enums.BusType;
import com.cdac.busmanagementsystem.repository.BusRepository;

@Service
public class BusService {

    @Autowired
    private BusRepository busRepository;

    // Save Bus
    public Bus saveBus(Bus bus) {
        return busRepository.save(bus);
    }

    // Get All Buses
    public List<Bus> getAllBuses() {
        return busRepository.findAll();
    }

    // Get Bus By ID
    public Optional<Bus> getBusById(int busId) {
        return busRepository.findById(busId);
    }

    // Get Bus By City
    public List<Bus> getBusByCity(String city) {
        return busRepository.findByCity(city);
    }

    // Get Bus By Bus Type
    public List<Bus> getBusByBusType(BusType busType) {
        return busRepository.findByBusType(busType);
    }

    // Delete Bus By Name
    public void deleteBusByName(String busName) {
        busRepository.deleteBusByName(busName);
    }

    // Update Bus Fare
    public void updateBusFare(int busId, double fare) {
        busRepository.updateBusFare(busId, fare);
    }

}
