package com.example.lms.Service.Implementor;

import com.example.lms.Entity.Transportation;
import com.example.lms.Pojo.TransportationPojo;
import com.example.lms.Repo.TransportationRepo;
import com.example.lms.Service.TransportationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Service

public class TransportationImpl implements TransportationService {
    private final TransportationRepo transportationRepo;
    @Override
    public void addVehicle(TransportationPojo transportationPojo) {
        Transportation transport=new Transportation();
        transport.setBusNo(transportationPojo.getBusNo());

        if (transportationPojo.getStudentId() != null) {
            transport.setStudentId(transportationPojo.getStudentId());
        } else {
            System.out.println("error or null value");

        }
        transport.setRoute(transportationPojo.getRoute());
        transport.setBusFee(transportationPojo.getBusFee());
        transportationRepo.save(transport);

    }

    @Override
    public List<Transportation> getAll() {
        return transportationRepo.findAll();
    }
    @Override
    public void deleteById(Integer busId) {
        System.out.println("My name is krishna bhandari");
        transportationRepo.deleteById(busId.longValue());
    }

    @Override
    public Optional<Transportation> findById(Integer busId) {
        return transportationRepo.findById(busId.longValue());
    }
}
