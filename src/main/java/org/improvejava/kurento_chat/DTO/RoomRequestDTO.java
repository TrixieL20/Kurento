package org.improvejava.kurento_chat.DTO;

public class RoomRequestDTO {
    String eventId;

    String userName;

    String cameraState;

    String audioState;

    RoomRequestDTO(String eventId, String userName, String cameraState, String audioState) {
        this.eventId = eventId;
        this.userName = userName;
        this.cameraState = cameraState;
        this.audioState = audioState;
    }

    public String toString() {
        return "eventId " + eventId
                + " userName " + userName
                + " cameraState " + cameraState
                + " audioState " + audioState;
    }
}
