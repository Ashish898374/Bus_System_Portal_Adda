package com.onlinebusadda.model;

import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Route {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Routeid;
	private String Routefrom;
	private String Routeto;
	private Integer distence;
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "route")
	private List<Bus> buses;

	public Route() {
		super();
	}

	public Route(Integer routeid, String routefrom, String routeto, Integer distence, List<Bus> buses) {
		Routeid = routeid;
		Routefrom = routefrom;
		Routeto = routeto;
		this.distence = distence;
		this.buses = buses;
	}

	public Integer getRouteid() {
		return Routeid;
	}

	public void setRouteid(Integer routeid) {
		Routeid = routeid;
	}

	public String getRoutefrom() {
		return Routefrom;
	}

	public void setRoutefrom(String routefrom) {
		Routefrom = routefrom;
	}

	public String getRouteto() {
		return Routeto;
	}

	public void setRouteto(String routeto) {
		Routeto = routeto;
	}

	public Integer getDistence() {
		return distence;
	}

	public void setDistence(Integer distence) {
		this.distence = distence;
	}

	public List<Bus> getBuses() {
		return buses;
	}
	public void setBuses(List<Bus> buses) {
		this.buses = buses;
	}

	@Override
	public String toString() {
		return "Route{" +
				"Routeid=" + Routeid +
				", Routefrom='" + Routefrom + '\'' +
				", Routeto='" + Routeto + '\'' +
				", distence=" + distence +
				", buses=" + buses +
				'}';
	}
}
