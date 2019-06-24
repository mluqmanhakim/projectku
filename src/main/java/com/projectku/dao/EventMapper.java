package com.projectku.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.projectku.model.EventModel;


@Mapper
public interface EventMapper {
	
	@Insert("INSERT INTO event (nama, kategori, lokasi, deskripsi) VALUES (#{nama}, #{kategori}, #{lokasi}, #{deskripsi})")
	void tambahEvent(EventModel event);
	
	@Select ("SELECT nama, kategori, lokasi, deskripsi FROM event")
	List<EventModel> ambilSemuaEvent();
	
}
