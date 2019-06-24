package com.projectku.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.projectku.model.EventModel;
import com.projectku.service.EventService;

@Controller
public class EventController {

	@Autowired
    EventService eventService;
	
	@RequestMapping("/event/tambah")
	public String tambahEvent() {
		return "tambah-event";
	}
	
	@RequestMapping("/event/tambah/simpan")
    public String simpanEvent (
            @RequestParam(value = "nama", required = false) String nama,
            @RequestParam(value = "kategori", required = false) String kategori,
            @RequestParam(value = "lokasi", required = false) String lokasi,
            @RequestParam(value = "deskripsi", required = false) String deskripsi)
    {
        EventModel event = new EventModel(0, nama, kategori, lokasi, deskripsi);
        eventService.tambahEvent(event);
        
        return "tambah-event-berhasil";
    }
	
	@RequestMapping("/event/semua")
	public String lihatSemuaEvent(Model model) {
		List<EventModel> events = eventService.lihatSemuaEvent();
		model.addAttribute("events", events);
		return "semua-event";
	}
	

}
