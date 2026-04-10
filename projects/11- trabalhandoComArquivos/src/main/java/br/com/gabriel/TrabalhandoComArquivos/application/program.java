package br.com.gabriel.TrabalhandoComArquivos.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Products;

public class program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Products> list = new ArrayList<>();
		
		System.out.print("Enter file path: ");
		String sourceFileStr = sc.nextLine();
		
		File sourceFile = new File(sourceFileStr);
		String sourceFolderStr = sourceFile.getParent();
		
		boolean success = new File(sourceFolderStr + "\\out").mkdir();
		System.out.println("Create file: " + success);
		String targetFileStr = sourceFolderStr + "\\out\\summary.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(sourceFile))){
			
			String itemCsv = br.readLine();
			while(itemCsv != null) {
				System.out.println(itemCsv);
				
				String[] fields = itemCsv.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);
				
				list.add(new Products(name,quantity,price));
				
				itemCsv = br.readLine();
			}
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))){
				
				for(Products prod : list) {
					bw.write(prod.getNameProduct() +", " + String.format("%.2f", prod.PriceTotal()));
					bw.newLine();
				}
				System.out.println();
				System.out.println(targetFileStr + "CREATED");
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}

}
