package com.projectku.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventModel {
	private int id;
	private String nama;
	private String kategori;
	private String lokasi;
	private String deskripsi;
}
