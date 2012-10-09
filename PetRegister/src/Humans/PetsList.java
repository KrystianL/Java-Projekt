package Humans;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import Pets.Dogs;

class PetsList implements List<Dogs> {
	
	private Human owner;
	private ArrayList<Dogs> Pets;
	
	public PetsList(Human owner)
	{
		this.owner=owner;
		Pets=new ArrayList<Dogs>();
	}
	
	@Override
	public int size(){
		return Pets.size();
	}
	@Override
	public Iterator<Dogs> iterator(){
		return null;
	}
	@Override
	public boolean contains (Object o){
		return false;
	}
	@Override
	public Object[] toArray() {
		
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		
		return null;
	}

	@Override
	public boolean add(Dogs e) {

		e.setOwner(owner);

		return Pets.add(e);
	}

	@Override
	public boolean remove(Object o) {
	
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends Dogs> d) {
		
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends Dogs> d) {

		return false;
	}

	@Override
	public boolean removeAll(Collection<?> d) {
		
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> d) {
		
		return false;
	}

	@Override
	public void clear() {
		

	}

	@Override
	public Dogs get(int index) {
		
		return null;
	}

	@Override
	public Dogs set(int index, Dogs element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(int index, Dogs element) {
		// TODO Auto-generated method stub

	}

	@Override
	public Dogs remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
	
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
	
		return 0;
	}

	@Override
	public ListIterator<Dogs> listIterator() {
	
		return null;
	}

	@Override
	public ListIterator<Dogs> listIterator(int index) {
		
		return null;
	}

	@Override
	public List<Dogs> subList(int fromIndex, int toIndex) {
		
		return null;
	}

	@Override
	public boolean isEmpty() {
		
		return false;
	}

}


