package org.adhyan.tutorials;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;


class StudentData {
	int id;
	String studentName;
	
	public StudentData(int id, String studentName) {
		super();
		this.id = id;
		this.studentName = studentName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentData other = (StudentData) obj;
		if (id != other.id)
			return false;
		if (studentName == null) {
			if (other.studentName != null)
				return false;
		} else if (!studentName.equals(other.studentName))
			return false;
		return true;
	}
	
	
}

public class Comparison {
	public static void main(String[] args) {		 
	
	
		 StudentData data1 = new StudentData(1,"Aditya");
		 StudentData data2 = new StudentData(1,"Aditya");
		 StudentData data3 = new StudentData(2,"Abhinav");
		 
	
		 HashSet<StudentData> dataStorage = new HashSet<StudentData>();
		                      dataStorage.add(data1);
		                      dataStorage.add(data2);
		                      dataStorage.add(data3);
		    
		 Iterator<StudentData> itr = dataStorage.iterator();
		 
		  while(itr.hasNext()) {
			  System.out.println(itr.next().hashCode());
		  }
		                      
		 
	}
}
