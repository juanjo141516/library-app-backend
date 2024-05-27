package com.library.project.web.services.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class LibroDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String titulo;
	private Date fechaPublic;
	private int stock;
	private String pasillo;
	private String autor;
	
}
