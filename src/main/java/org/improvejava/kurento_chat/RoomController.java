package org.improvejava.kurento_chat;

import org.improvejava.kurento_chat.DTO.RoomRequestDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rooms")
public class RoomController {
    @PostMapping
    public ResponseEntity<String> createRoom(@RequestBody RoomRequestDTO roomReqDTO) {
        // JSON 데이터를 Map 형태로 받음
        System.out.println("Received data: " + roomReqDTO.toString());
        return ResponseEntity.ok("Data received successfully");
    }
}
