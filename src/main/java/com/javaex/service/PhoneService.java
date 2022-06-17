package com.javaex.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.PhoneDao;
import com.javaex.vo.PersonVo;

@Service
public class PhoneService {

	//필드
	@Autowired
	private PhoneDao phoneDao;
	
	
	//생성자
	
	
	//GS
	
	
	//일반
	
	public List<PersonVo> getPersonList(){
	
//		PhoneDao phoneDao = new PhoneDao();
		List<PersonVo> personList = phoneDao.getPersonList();
		
		return personList;

	}
	
	public int personInsert(PersonVo personVo) {
		
		int count = phoneDao.personInsert(personVo);
		
		return count;
		
	}
	
	public int personInsert2() {
		System.out.println("personInsert2");
	
		Map<String, Object> pMap = new HashMap<String, Object>();
		pMap.put("name", "황일영");
		pMap.put("hp", "010-3333-3333");
		pMap.put("company", "02-3333-3333");
		
		int count = phoneDao.personInsert2(pMap);
	
		return count;
	}
	

	public int personDelete(int no) {
		
		int count = phoneDao.personDelete(no);
		
		return count;
		
	}
	
	public PersonVo getPerson(int no) {
		
		PersonVo personVo = (PersonVo)phoneDao.getPerson(no);
		
		return personVo;
	}

	public Map<String, Object> getPerson2(int no) {
		
		Map<String, Object> pMap = phoneDao.getPerson2(no);
		
		return pMap;
	}

	public int personUpdate(PersonVo personVo) {
		
		int count = phoneDao.personUpdate(personVo);
		
		return count;
	}
}
