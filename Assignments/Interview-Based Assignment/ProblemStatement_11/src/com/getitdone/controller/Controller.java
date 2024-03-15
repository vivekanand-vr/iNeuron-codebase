package com.getitdone.controller;

import com.getitdone.repository.Repository;
/*Write a Java program that connects to a MySQL database using JDBC. The program
should read data from a table and display the results in the console.
*/
public class Controller {

	public static void main(String[] args) {
		Repository repo =new Repository();
		repo.getData();

	}

}
