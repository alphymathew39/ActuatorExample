//package com.example.ActuatorExample;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@RestController
//public class MyEndpoint {
//
//    @GetMapping("/status")
//    public Map<String, String> getStatus(@RequestParam int value) {
//        Map<String, String> status = new HashMap<>();
//
//        if (value >= 10) {
//            status.put("status", "up");
//        } else {
//            status.put("status", "down");
//        }
//
//        return status;
//    }
//}
