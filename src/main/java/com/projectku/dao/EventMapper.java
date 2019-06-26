package com.projectku.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.projectku.model.EventModel;


@Mapper
public interface EventMapper {
	
	@Insert("INSERT INTO event (nama, kategori, lokasi, deskripsi) VALUES (#{nama}, #{kategori}, #{lokasi}, #{deskripsi})")
	void tambahEvent(EventModel event);
	
	@Select ("SELECT id, nama, kategori, lokasi, deskripsi FROM event")
	List<EventModel> ambilSemuaEvent();
	
	@Update("UPDATE event SET nama=#{nama}, kategori=#{kategori}, lokasi=#{lokasi}, deskripsi=#{deskripsi} WHERE id=#{id}")
	void ubahEvent(EventModel event);
	
	@Select ("SELECT id, nama, kategori, lokasi, deskripsi FROM event WHERE id=#{id}")
	EventModel ambilEvent(int id);
	
	@Delete ("DELETE FROM event WHERE id=#{id}")
	void hapusEvent(int id);
	
}
