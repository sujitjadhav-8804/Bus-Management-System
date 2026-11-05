
package com.cdac.busmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.cdac.busmanagementsystem.entity.Bus;
import com.cdac.busmanagementsystem.enums.BusType;
import com.cdac.busmanagementsystem.service.BusService;

@RestController
@RequestMapping("/bus")
public class BusController {

    @Autowired
    private BusService busService;

    // Save Bus
    @PostMapping
    public Bus saveBus(@RequestBody Bus bus) {
        return busService.saveBus(bus);
    }

    // Get All Buses
    @GetMapping
    public List<Bus> getAllBuses() {
        return busService.getAllBuses();
    }

    // Get Bus By ID
    @GetMapping("/{busId}")
    public ResponseEntity<Bus> getBusById(@PathVariable int busId) {

        return busService.getBusById(busId)
                .map(bus -> ResponseEntity.ok(bus))
                .orElseGet(() ->
                        ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    // Get Bus By City
    @GetMapping("/city/{city}")
    public List<Bus> getBusByCity(@PathVariable String city) {
        return busService.getBusByCity(city);
    }

    // Get Bus By Type
    @GetMapping("/type/{busType}")
    public List<Bus> getBusByType(@PathVariable BusType busType) {
        return busService.getBusByBusType(busType);
    }

    // Delete Bus By Name
    @DeleteMapping("/name/{busName}")
    public String deleteBusByName(@PathVariable String busName) {
        busService.deleteBusByName(busName);
        return "Bus deleted successfully.";
    }

    // Update Bus Fare
    @PutMapping("/{busId}/{fare}")
    public String updateBusFare(
            @PathVariable int busId,
            @PathVariable double fare) {

        busService.updateBusFare(busId, fare);
        return "Bus fare updated successfully.";
    }
}
