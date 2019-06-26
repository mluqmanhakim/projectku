package com.projectku.service;

import java.util.List;

import com.projectku.model.EventModel;

public interface EventService {
	void tambahEvent(EventModel event);
	
	List<EventModel> lihatSemuaEvent();
	
	void ubahEvent(EventModel event);
	
	EventModel ambilEvent(int id);
	
	void hapusEvent(int id);
}
