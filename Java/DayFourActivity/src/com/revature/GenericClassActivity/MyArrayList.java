package com.revature.GenericClassActivity;

public class MyArrayList <T>{
	
	Object[] dataArr = new Object[10];
	int counter = 0;
	
	public void add(T object) {
		//first time that array is resized
		if(counter == dataArr.length) {
			Object[] biggerArr = resizeArray(dataArr);
			biggerArr[counter] = object;
			dataArr = biggerArr;
		}
		//array doesn't need to be resized
		else {
			dataArr[counter] = object;
		}
		counter++;
	}
	
	public T get(int index) {
		return (T)dataArr[index];
	}
	
	public Object[] resizeArray(Object[] oldArr) {
		Object[] newArr = new Object[counter+1];
		
		for (int i = 0; i < oldArr.length; i++){
			newArr[i] = oldArr[i];
		}
		
		return newArr;
	}

}
