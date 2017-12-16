package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.GirlMapper;
import com.example.po.Girl;

@Service
public class GirlServiceImpl implements GirlService {
	
	@Autowired
	public GirlMapper girlMapper;

	@Override
	public List<Girl> findAll() {
		return girlMapper.findAll();
	}

}
