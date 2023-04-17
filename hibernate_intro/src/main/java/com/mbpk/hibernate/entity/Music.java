package com.mbpk.hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Songs")
public class Music {
	@Id
	@Column(name="Songid")
	private int Songid;
	@Column(name="SongName")
	private String SongName;
	@Column(name="Singer")
	private String Singer;
	
	
	public int getSongid() {
		return Songid;
	}
	public void setSongid(int songid) {
		Songid = songid;
	}
	public String getSongName() {
		return SongName;
	}
	public void setSongName(String songName) {
		SongName = songName;
	}
	public String getSinger() {
		return Singer;
	}
	public void setSinger(String singer) {
		Singer = singer;
	}
	@Override
	public String toString() {
		return "Music [Songid=" + Songid + ", SongName=" + SongName + ", Singer=" + Singer + "]";
	}
	public Music(int songid, String songName, String singer) {
		super();
		Songid = songid;
		SongName = songName;
		Singer = singer;
	}
	public Music() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
