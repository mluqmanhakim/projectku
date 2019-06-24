package com.projectku.service;

import java.util.List;

import com.projectku.model.EventModel;

public interface EventService {
	void tambahEvent(EventModel event);
	
	List<EventModel> lihatSemuaEvent();
}
