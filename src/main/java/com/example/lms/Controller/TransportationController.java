package com.example.lms.Controller;

import com.example.lms.Entity.Transportation;
import com.example.lms.Pojo.TransportationPojo;
import com.example.lms.Service.TransportationService;
import com.example.lms.Shared.GlobalApiResponse;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@Getter
@Setter
@RequiredArgsConstructor
@RequestMapping("/transport")
public class TransportationController {
    private final TransportationService transportationService;
    @GetMapping("/get")
    public GlobalApiResponse<List<Transportation>> getData() {
        return GlobalApiResponse.
                <List<Transportation>>builder()
                .data(transportationService.getAll())
                .statusCode(200)
                .message("Data retrieved successfully!")
                .build();
    }

    //
    @PostMapping("/save")
    public void save(@RequestBody TransportationPojo transportationPojo) {

        this.transportationService.addVehicle(transportationPojo);
    }

    @GetMapping("/get/{id}")
    public Optional<Transportation> getData(@PathVariable Integer id) {
        System.out.println("Hello");
        return transportationService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Integer id) {
        this.transportationService.deleteById(id);
    }

}
