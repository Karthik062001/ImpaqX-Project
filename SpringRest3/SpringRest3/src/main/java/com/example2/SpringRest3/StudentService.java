package com.example2.SpringRest3;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

	List<Student> list=Arrays.asList(new Student(101,"Sagar","Hassan",454678678),
			new Student(102,"Tejaswini","Mysore",43546956),
			new Student(103,"Karan","Madikeri",34509348),
			new Student(104,"Harry","Madikeri",54695533),
			new Student(105,"Pooja","Bengalore",34534059));
	
	public List<Student> get() {
		return list;
	}

	public void post(Student std) {
		list.add(std);
	}

	public void put(Student std) {

		int data = 0;
		for (int i = 0; i <= list.size(); i++) {
			if (list.get(i).getStId() == std.getStId()) {
				data = i;
			}
		}
		list.set(data, std);

	}

	public void delete(Student std) {

		int data = 0;
		for (int i = 0; i <= list.size(); i++) {
			if (list.get(i).getStId() == std.getStId()) {
				data = i;
			}
		}
		list.remove(data);

	}
}
