package com.tech.springmvc.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Employee implements Serializable {
	@Id
	private int id;
	private String name;
	private String password;
	private double sal;
	private String place;
}
