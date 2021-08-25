package Phase2;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class FileOperations {

	 public void menu() throws IOException{
	 int ex;
	 
	
	 do {
		 
		 System.out.println("..........Welcome to LockedMe.com...........");
		 System.out.println("-------------Full stack developer---------------");
		 System.out.println("-------------Dipti Aher------------");
		 System.out.println("======Enter the options given here for performing file operations======");
		 System.out.println("1: Display the files in ascending order");
		 System.out.println("2: To perform more operations on the  file ");
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 int ch=Integer.parseInt(br.readLine());
		
		 switch(ch)
		 {
		 case 1:
		 {
			 
			 File currentDir = new File("files");
			
	
			 if(currentDir.isDirectory())
			 {
				 //Fetching files from directory
				 
				 File[] files=currentDir.listFiles();
				 
				 //sort files by name
				 Arrays.sort(files);
				 System.out.println("----Sorted files:-----");
				 for (File file:files) {
					
					 System.out.println(file.getName());
				 }
				 
			 }
		 }
		 break;
		 
		 case 2:
		 {
			 do {
				 BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
				 
				 System.out.println("1: Add a file to folder");
				 System.out.println("2: Delete a file from folder");
				 System.out.println("3: Search a file from folder");
				 
				 
				 int ch1=Integer.parseInt(br.readLine());
				 
				 switch(ch1)
				 {
				 
				 case 1:
				 {
					 
					 
					 File currentDir = new File("files");
					 if(!currentDir.exists()){
						 currentDir.mkdir();
						 System.out.println("Directory not found!");
						 
						 }
					 else {
						 System.out.println("Directory found!");
					 }
					 
					 System.out.println("Enter file name to add:");
					 String filename=br1.readLine();
					 
					 File tagFile=new File(currentDir,filename+".txt");
					 if(!tagFile.exists()){
						 
					 tagFile.createNewFile();
					 System.out.println("File created Successfully!");
					 }
					 else {
						 System.out.println("File already exist!");
						
					 }
					 
					 FileOutputStream fos=new FileOutputStream(tagFile, true);   
					 System.out.print("Enter file content: ");         
					 String str=br1.readLine();    
					 byte[] b= str.getBytes(); 
					 System.out.println("Data added successfully!");
					 fos.write(b);           
					 fos.close();    
				 }
				 break;
				 
				 case 2:
				 {
					 File currentDir = new File("files");
					 if(!currentDir.exists()){
						 currentDir.mkdir();
						 System.out.println("Directory not found!");
						 
						 }
					 else {
						 System.out.println("Directory found!");
					 }
					 
					 System.out.println("Enter file name to delete:");
					 String filename1=br1.readLine();
					 
					 File tagFile=new File(currentDir,filename1+".txt");
					 if(tagFile.exists()){
						 
					 tagFile.delete();
					 System.out.println("File deleted Successfully!");
					 }
					 else {
						 System.out.println("File not found!");
					 }
					 
				 }
				 
				 break;
				 
				 case 3:
				 {
					 File currentDir = new File("files");
					 if(!currentDir.exists()){
						 currentDir.mkdir();
						 System.out.println("Directory not found!");
						 
						 }
					 else {
						 System.out.println("Directory found!");
					 }
					 
					 System.out.println("Enter file name to Search:");
					 String filename1=br1.readLine();
					 
					 File tagFile=new File(currentDir,filename1+".txt");
					 if(tagFile.exists()){
						 System.out.println("File found!");
						 System.out.println(tagFile.getAbsolutePath());
						 
					 }
					 else {
						 System.out.println("File not found!");
					 }
				 }
				 break;
				 
				 case 4:
					 default: System.out.println("Invalid Choice");
					 break;
				 }
				 System.out.println("Do you want to continue for adding,deleting,or searching operations? 1.yes 2.No");
				 ex=Integer.parseInt(br.readLine());
			 }
			 while(ex==1);
		 }
		 break;
		
		 case 3:
			 default:  System.out.println("Invalid Choice");
			 break;

		 }
		 System.out.println("Do you want to continue to perform more operations? 1.yes 2.No");
		 ex=Integer.parseInt(br.readLine());
		 }
	 while(ex==1);
	

	
	}
	
}
