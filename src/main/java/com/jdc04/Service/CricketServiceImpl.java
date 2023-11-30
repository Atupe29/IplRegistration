package com.jdc04.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jdc04.Repository.CricketRepository;
import com.jdc04.entity.Cricket;

@Service
public class CricketServiceImpl implements CricektService {
	@Autowired
	private CricketRepository cricketRepository;

	@Override
	public void registerTeam(Cricket cricket) {
		cricketRepository.save(cricket);

	}

}
