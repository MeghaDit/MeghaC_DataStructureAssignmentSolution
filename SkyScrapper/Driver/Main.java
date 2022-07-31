package com.greatLearning.SkyScrapper.Driver;

import java.util.Scanner;

import com.greatLearning.SkyScrapper.Service.AssembleFloor;
import com.greatLearning.SkyScrapper.Service.LinkedList;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		LinkedList floorSizeList = new LinkedList();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the total no of floors in the building");
		int noFloors = input.nextInt();
		if(noFloors == 0 ) {
			System.out.println("Invalid No of floors");
			return;
		}
		
		for(int i=1; i<=noFloors;i++) {
			System.out.println("Enter the floor size given on day : " + i );
			floorSizeList.append(input.nextInt());
			}
		input.close();
		/* Initialize max with max number of floors */		
	    int maxFloorSize = noFloors;
		System.out.println("The order of Construction is as follows");
		AssembleFloor floorAssemble = new AssembleFloor();
		floorAssemble.checkAssembleFloors(floorSizeList,noFloors,maxFloorSize);

	}

}
