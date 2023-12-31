package com.ashu.practice.web;

import com.ashu.practice.model.Location;
import com.ashu.practice.service.GeoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/location")
@RequiredArgsConstructor
@Slf4j
public class LocationController {

    private final GeoService geoService;

    @PostMapping
    public ResponseEntity<String> addLocation(@RequestBody Location location) {
        log.info("Request received to create location={}", location);
        geoService.add(location);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/nearby")
    public ResponseEntity<List<String>> locations(Double lat, Double lng, Double km) {
        log.info("Request received to get details for latitude={}, longitude={},radios={}", lat, lng, km);
        List<String> locations = geoService.nearByVenues(lng, lat, km);
        return ResponseEntity.ok(locations);
    }

}
