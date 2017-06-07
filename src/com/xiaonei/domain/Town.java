package com.xiaonei.domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Town entity. @author MyEclipse Persistence Tools
 */

public class Town implements java.io.Serializable {

	// Fields

	private Integer id;
	private City city;
	private String name;
	private Set primaryschools = new HashSet(0);
	private Set techschools = new HashSet(0);
	private Set juniors = new HashSet(0);
	private Set seniors = new HashSet(0);

	// Constructors

	/** default constructor */
	public Town() {
	}

	/** minimal constructor */
	public Town(String name) {
		this.name = name;
	}

	/** full constructor */
	public Town(City city, String name, Set primaryschools, Set techschools,
			Set juniors, Set seniors) {
		this.city = city;
		this.name = name;
		this.primaryschools = primaryschools;
		this.techschools = techschools;
		this.juniors = juniors;
		this.seniors = seniors;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public City getCity() {
		return this.city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getPrimaryschools() {
		return this.primaryschools;
	}

	public void setPrimaryschools(Set primaryschools) {
		this.primaryschools = primaryschools;
	}

	public Set getTechschools() {
		return this.techschools;
	}

	public void setTechschools(Set techschools) {
		this.techschools = techschools;
	}

	public Set getJuniors() {
		return this.juniors;
	}

	public void setJuniors(Set juniors) {
		this.juniors = juniors;
	}

	public Set getSeniors() {
		return this.seniors;
	}

	public void setSeniors(Set seniors) {
		this.seniors = seniors;
	}

}