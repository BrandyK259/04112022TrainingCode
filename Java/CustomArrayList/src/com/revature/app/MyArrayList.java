package com.revature.app;

public class MyArrayList <T> {

	private Object[] data = new Object[10];
	private int counter = 0;
	
	public MyArrayList() {
		
	}
	
	public int getSize() {
		return counter;
	}
	
	public void add(T element) {
		
		if (counter + 1 >= data.length) {
			//Resize the array
			resize();
		}
		
		data[counter] = element;
		++counter;
	}
	
	public T get(int index) {
		
		if(index < 0 || index >= data.length )
			throw new IndexOutOfBoundsException();
		
		return (T)data[index];
	}
	
	public void resize() {
		//Calculate new size and create a new array
			int newSize = data.length*2;
			Object[] newData = new Object[newSize];
			
			for (int i = 0; i < data.length; i++){
				newData[i] = data[i];
			}
			
			// Replace data array with NewData
			data = newData;
	}
	
}
