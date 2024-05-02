package edu.curtin.oose2024s1.assignment2;

import java.io.*;

/**
 * Use this code to get started on Assignment 2. You are free to modify or
 * replace this file as
 * needed (to fulfil the assignment requirements, of course).
 */
public class App {
	public static void main(String[] args) {
		BikeShopInput inp = new BikeShopInput();
		// BikeShopInput inp = new BikeShopInput(123); // Seed for the random number
		// generator

		try {
			while (System.in.available() == 0) {
				// ... ?

				// For illustration purposes -- this just prints out the messages as they come
				// in.
				System.out.println("---");
				String msg = inp.nextMessage();
				while (msg != null) {
					System.out.println(msg);
					msg = inp.nextMessage();
				}

				// Wait 1 second
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("Got interrupted, throwing assertion error");
					throw new AssertionError(e);
				}
			}
		} catch (IOException e) {
			System.out.println("Error reading user input");
		}
	}
}
