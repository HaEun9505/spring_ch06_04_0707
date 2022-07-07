package com.haeun.test;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
//DI 설정해주는 Container클래스 - 스프링 설정에 사용되는 클래스
@Configuration
//xml파일(applicationCTX.xml)을 Resource로 불러오기
@ImportResource("classpath:applicationCTX.xml")
public class ApplicationConfig {
	
	@Bean
	public Student student1() {	//반환되는 자료타입이 Student클래스, student1:bean의 이름(id)
		
		ArrayList<String> hobbys = new ArrayList<String>();	//배열 객체
		hobbys.add("운동");
		hobbys.add("노래");
		
		//student: bean 이름
		Student student = new Student("홍길동", 25, hobbys);
		
		//생성자 없으므로, setter
		student.setWeight(80);
		student.setHeight(180);
		return student;
	}
	@Bean
	public Student student2() {	//반환되는 자료타입이 Student클래스, student2:bean의 이름(id)
		
		ArrayList<String> hobbys = new ArrayList<String>();	//배열 객체
		hobbys.add("달리기");
		hobbys.add("자전거");
		
		//student: bean 이름
		Student student = new Student("김유신", 25, hobbys);
		
		//생성자 만들지 않았으므로, setter로 설정
		student.setWeight(60);
		student.setHeight(150);
		return student;
	}
	
}
