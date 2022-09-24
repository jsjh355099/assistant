package com.feather.assistant.event;

import com.feather.assistant.$Entity.EventEntity;
import com.feather.assistant.$CommonFIle.AssistantApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {
    @Autowired
    EventRepository eventRepository;


    @AssistantApiResponse
    @GetMapping("/ls")
    public List<EventEntity> getAllEvent() {
        return eventRepository.findAll();
    }

    @AssistantApiResponse
    @PostMapping("/s")
    public void setEvent(@RequestBody EventEntity eventEntity) {
        eventRepository.save(eventEntity);
    }

    @DeleteMapping("/d")
    public void deleteEvent(@RequestParam("id_event") Integer id_event) {
        eventRepository.deleteById(id_event);
    }
}
