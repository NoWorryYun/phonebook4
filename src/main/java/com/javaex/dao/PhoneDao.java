package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.PersonVo;

@Repository
public class PhoneDao {
	// 필드
	@Autowired
	private SqlSession sqlSession;

	public List<PersonVo> getPersonList() {

		List<PersonVo> personList = sqlSession.selectList("phonebook.selectList");
		System.out.println(personList);
		
		return personList;
	}

	//전화번호 등록
	public int personInsert(PersonVo personVo) {
		int count = sqlSession.insert("phonebook.personInsert", personVo);
		
		return count;
	}
	//삭제
	public int personDelete(int no) {
		
		int count = sqlSession.delete("phonebook.personDelete", no);
		
		return count;
	}

	//수정
	public int personUpdate(PersonVo personVo) {
		
		int count = sqlSession.update("phonebook.personUpdate", personVo);
		
		return count;
		
	}
	//한명 뽑아내기
	public PersonVo getPerson(int no) {
		
		PersonVo personVo = sqlSession.selectOne("phonebook.getPerson", no);
		
		return personVo;
	}
	
}
