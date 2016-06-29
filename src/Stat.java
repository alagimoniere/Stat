/* Stat.java

 * Author: Alyssa Lagimoniere
 * Submission Date: 4/19/15
 * 
 * Purpose: To create methods to get the different
 * values of Stat and compare to others.
 * 
 * Statement of Academic Honesty: 
 * 
 * The following code represents my own work. I have neither
 * received nor given inappropriate assistance. I have not copied
 * or modified code from any source other than the course webpage
 * or the course textbook. I recognize that any unauthorized
 * assistance or plagiarism will be handled in accordance with 
 * the University of Georgia's Academic Honesty Policy and the
 * policies of this course. I recognize that my work is based
 * on an assignment created by the Department of Computer
 * Science at the University of Georgia. Any publishing
 * or posting of source code for this project is strictly
 * prohibited unless you have written consent from the Department
 * of Computer Science at the University of Georgia. 
 */

import java.util.Arrays;

public class Stat {

	private double[] data;
	
	//The default constructor for Stat
	public Stat() {
		data = new double[0];
	}
		
	//Constructs a Stat object using the values held in d. The constructor
	//should create a double array of the same length as d and holding copies 
	//of the values of d. A reference to this new array should be assigned to data.
	public Stat(double[] d) {
		if (d == null) {
			data = new double [0];
			return;
		}
		double [] array = new double [d.length];
		if (d != null) {
			for (int i = 0; i < array.length; i++) {
				array[i] = d[i];
			}
		}
		data = array;
	}
	
	public Stat(float[] f) {
		double [] array = new double [f.length];
		if (f != null) {
			for (int i = 0; i < array.length; i++) {
				array[i] = f[i];
			}
		}
		data = array;
	}
	
	public Stat(int[] i) {
		double [] array = new double [i.length];
		if (i != null) {
			for (int x = 0; x < array.length; x++) {
				array[x] = i[x];
			}
		}
		data = array;
	}
	
	public Stat(long[] lo) {
		double [] array = new double [lo.length];
		if (lo != null) {
			for (int i = 0; i < array.length; i++) {
				array[i] = lo[i];
			}
		}
		data = array;
	}
	
	//This is a mutator (set or setter) method used to set the values of the
	//data array. The method should create a new array containing exactly the 
	//elements of d and assign to data a reference to this new array (that 
	//is, the method should not simply assign d to data).
	public void setData(double [] d) {
		if (d != null) {
			data = new double [d.length];
			for (int i = 0; i < d.length; i++) {
				data[i] = d[i];
			}
		}
		if (d == null) {
			data = new double [0];
		}
	}
	
	public void setData(float[] f) {
		data = new double [f.length];
		if (f != null) {
			for (int i = 0; i < f.length; i++) {
				data[i] = f[i];
			}
		}
	}
	
	public void setData(int[] i) {
		data = new double [i.length];
		if (i != null) {
			for (int x = 0; x < i.length; x++) {
				data[x] = i[x];
			}
		}
	}
	
	public void setData(long [] lo) {
		data = new double [lo.length];
		if (lo != null) {
			for (int i = 0; i < lo.length; i++) {
				data[i] = lo[i];
			}
		}
	}
		
	//This is an accessor (get or getter) method used to retrieve the values of 
	//data. This method should not return a reference to data. Instead, it 
	//should create a new array containing exactly the values contained in data, 
	//and then return a reference to this new array.
	public double[] getData() {
		return data;
	}
	
	//Returns the boolean value true if the data objects of both the calling
	//Stat object and the passed Stat object s have the same values (and in 
	//the same order). Otherwise, it returns false.
	public boolean equals(Stat s) {
		boolean equals = false;
		if (s == null || s.data.length == 0) {
			if (data == null) {
				return true;
			} else {
				return false;
			}
		} 	
		for (int i = 0; i < data.length; i++) {
			if (this.data[i] == s.data[i]) {
				equals = true;
				continue;
			} else
				equals = false;
				break;
		}
		if (this.data.length != s.data.length) {
			equals = false;
		}
		return equals;
	}
	
	public void reset() {
		double [] array = new double [0];
		data = array;
	}
	
	public void append(double [] d) {
		if (d == null) {
			return;
		} 
		double [] array = new double [data.length + d.length];
		if (d != null) {
			int i = 0;
			while (i < data.length) {
				array[i] = data[i];
				i++;
			}
			int j = 0;
			while (j < d.length) {
				array[j + data.length] = d[j];
				j++;
			}
		}
		data = array;
	}
	
	public void append(int[] i) {
		double [] array = new double [data.length + i.length];
		int x = 0;
		while (x < data.length) {
			array[x] = data[x];
			x++;
		}
		int j = 0;
		while (j < i.length) {
			array[j + data.length] = i[j];
			j++;
		}
		data = array;
	}
	
	public void append(float[] f) {
		double [] array = new double [data.length + f.length];
		int i = 0;
		while (i < data.length) {
			array[i] = data[i];
			i++;
		}
		int j = 0;
		while (j < f.length) {
			array[j + data.length] = f[j];
			j++;
		}
		data = array;
	}
	
	public void append(long[] lo) {
		double [] array = new double [data.length + lo.length];
		int i = 0;
		while (i < data.length) {
			array[i] = data[i];
			i++;
		}
		int j = 0;
		while (j < lo.length) {
			array[j + data.length] = lo[j];
			j++;
		}
		data = array;
	}
	
	public boolean isEmpty() {
		if (data.length == 0)
			return true;
		else
			return false;
	}
	
	//Returns a String representation of the data elements stored in the Stat 
	//object. Use the samples listed below as guidelines for formatting.
	public String toString() {
		String dataString = Arrays.toString(data);
		return dataString;
		
	}
	
	//Returns the minimum of the data array.
	public double min() {
		if (data.length == 0) {
			return Double.NaN;
		}
		double min = data[0];
		for (int i = 1; i < data.length; i++) {
			if(data[i] < min) {
				min = data[i];
			}
		}
		return min;
	}
	
	//Returns the maximum of the data array.
	public double max() {
		if (data.length == 0) {
			return Double.NaN;
		}
		double max = data[0];
		for (int i = 1; i < data.length; i++) {
			if(data[i] > max) {
				max = data[i];
			}
		}
		return max;	
	}

	//Returns the average of the data array. The average is defined to be 
	//a double value that returns the mean value of a given array of numbers.
	public double average() {
		if (data.length == 0) {
			return Double.NaN;
		}
		double sum = 0;
	    for(int i = 0; i < data.length; i++) 
	    	sum = sum + data[i]; 
	    double average = sum / data.length; 
	    return average;
	}
	
	//The mode is the value that occurs most frequently in a collection of values.
	//In the Stat class, if one value occurs more frequently in data than all 
	//others, then mode() should return this value. Otherwise, mode() should return 
	//Double.NaN, indicating that no unique value exists. Note: this method is more
	//difficult to code than the other methods, and it should be completed last.
	public double mode() {
		if (data.length == 0) {
			return Double.NaN;
		}
		Arrays.sort(data);
		 double mode = 0.0;
		 double maxCount = 0.0;
	        for (int i = 0; i < data.length; i++) {
	            int count = 0;
	            int j = i;
	            while (j < data.length) {
	                if (data[i] == data[j]) {
	                    count++;
	                    j++;
	                } else {
	                    break;
	                }
	            }

	            if (count > maxCount) {
	                maxCount = count;
	                mode = data[i];
	            } else if (count == maxCount) {
	                maxCount = count;
                	mode = Double.NaN;
	            }
	        }

	        return mode;
	}
	
	private int occursNumberOfTimes(double value) {
		int count = 0;
		int i = 0;
		for (i = 0; i < data.length; i++) {
			if (data[i] == value)
				count++;
		}
		return count;
	}
	
	public double variance() {
		if (data.length == 0) {
			return Double.NaN;
		}
		double [] variances = new double [data.length];
		for (int i = 0; i < data.length; i++) {
			variances[i] = Math.pow((data[i] - average()), 2);
		}
		double sum = 0;
	    for(int i = 0; i < data.length; i++) 
	    	sum = sum + variances[i]; 
	    double variance = sum / variances.length; 
		return variance;
	}
	
	public double standardDeviation() {
		if (data.length == 0) {
			return Double.NaN;
		}
		double standardDeviation = Math.sqrt(variance());
		return standardDeviation;
	}
	
	public static void main(String[] args) {
		double[] data1 = {10,10};
		int[] data2 = {10,10};
		Stat stat1 = new Stat(data1); 
		Stat stat2 = new Stat(data2);
		Stat stat3 = null;
		Stat stat4 = null;
		System.out.println("stat1 data = " + stat1.toString());
		System.out.println("stat2 data = " + stat2.toString());
		System.out.println("stat3 data = " + stat3.toString());
		System.out.println("stat1 equals stat2 = " + stat1.equals(stat2));
		System.out.println("stat1 equals stat3 = " + stat1.equals(stat3));
		System.out.println("stat1 equals stat4 = " + stat1.equals(stat4));
		System.out.println("stat3 equals stat4 = " + stat3.equals(stat4));

	}
}