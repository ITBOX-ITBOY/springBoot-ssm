package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.po.Girl;
import com.example.service.GirlService;


@RestController
public class GirlContorller{
	
	@Autowired
	public GirlService girlService;
	
	@RequestMapping("findAll")
	public List<Girl> findAll() {
		return girlService.findAll();
	}
	
}
