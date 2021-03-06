package com.and4.travel_server.model;

import lombok.Data;

@Data
public class Diary {

	private int dno;
	private String title;
	private String content;
	private String date;
	private String on_off;
	private int hitcount;
	private int good;
	private int trip_id;
	private String image_uri;
}
