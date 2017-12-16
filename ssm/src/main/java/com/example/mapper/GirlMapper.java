package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.po.Girl;

@Mapper
public interface GirlMapper {
	List<Girl> findAll();
}
