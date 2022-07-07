package com.haeun.test;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
//DI �������ִ� ContainerŬ���� - ������ ������ ���Ǵ� Ŭ����
@Configuration
//xml����(applicationCTX.xml)�� Resource�� �ҷ�����
@ImportResource("classpath:applicationCTX.xml")
public class ApplicationConfig {
	
	@Bean
	public Student student1() {	//��ȯ�Ǵ� �ڷ�Ÿ���� StudentŬ����, student1:bean�� �̸�(id)
		
		ArrayList<String> hobbys = new ArrayList<String>();	//�迭 ��ü
		hobbys.add("�");
		hobbys.add("�뷡");
		
		//student: bean �̸�
		Student student = new Student("ȫ�浿", 25, hobbys);
		
		//������ �����Ƿ�, setter
		student.setWeight(80);
		student.setHeight(180);
		return student;
	}
	@Bean
	public Student student2() {	//��ȯ�Ǵ� �ڷ�Ÿ���� StudentŬ����, student2:bean�� �̸�(id)
		
		ArrayList<String> hobbys = new ArrayList<String>();	//�迭 ��ü
		hobbys.add("�޸���");
		hobbys.add("������");
		
		//student: bean �̸�
		Student student = new Student("������", 25, hobbys);
		
		//������ ������ �ʾ����Ƿ�, setter�� ����
		student.setWeight(60);
		student.setHeight(150);
		return student;
	}
	
}
