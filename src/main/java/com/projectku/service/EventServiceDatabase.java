package com.projectku.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectku.dao.EventMapper;
import com.projectku.model.EventModel;

@Service
public class EventServiceDatabase implements EventService {
	@Autowired
	EventMapper eventMapper;
	
	@Override
	public void tambahEvent(EventModel event) {
		eventMapper.tambahEvent(event);
	}

	@Override
	public List<EventModel> lihatSemuaEvent() {
		return eventMapper.ambilSemuaEvent();
	}

	@Override
	public void ubahEvent(EventModel event) {
		eventMapper.ubahEvent(event);
	}
	
	@Override
	public EventModel ambilEvent(int id) {
		return eventMapper.ambilEvent(id);
	}

	@Override
	public void hapusEvent(int id) {
		eventMapper.hapusEvent(id);
	}

}
