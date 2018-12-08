package com.srihari;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PersonImp implements PersonService {
	
	private static Map<Integer,Person> persons=new HashMap<Integer,Person>();

	@Override
	public boolean addPerson(Person p) {
		// TODO Auto-generated method stub
		if(persons.get(p.getId()) != null) return false;
		persons.put(p.getId(),p);
		return true;
	}

	@Override
	public boolean deletePerson(int id) {
		// TODO Auto-generated method stub
		persons.remove(id);
		return true;
	}

	@Override
	public Person getPerson(int id) {
		// TODO Auto-generated method stub
		return persons.get(id);
	}

	@Override
	public Person[] getAllPersons() {
		// TODO Auto-generated method stub
		
		
		Set<Integer> ids=persons.keySet();
		Person[] p=new Person[ids.size()];
		int i=0;
		for(Integer id : ids){
			p[i] = persons.get(id);
			i++;
		}
		return p;
	}

	
	
}
