
package com.cdac.busmanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.cdac.busmanagementsystem.entity.Bus;
import com.cdac.busmanagementsystem.enums.BusType;

import jakarta.transaction.Transactional;

public interface BusRepository extends JpaRepository<Bus, Integer> {

    // Get Bus By City
    List<Bus> findByCity(String city);

    // Get Bus By Bus Type
    List<Bus> findByBusType(BusType busType);

    // Delete Bus By Name
    @Transactional
    @Modifying
    @Query("DELETE FROM Bus b WHERE b.busName = ?1")
    void deleteBusByName(String busName);

    // Update Bus Fare
    @Transactional
    @Modifying
    @Query("UPDATE Bus b SET b.fare = ?2 WHERE b.busId = ?1")
    void updateBusFare(int busId, double fare);

}
