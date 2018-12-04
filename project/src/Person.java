import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageObserver;

import javax.swing.*;

import java.awt.event.MouseEvent;
import java.util.*;


public class Person extends DrawObject
{
           
	public double WhereMove = 0; 			
	public double HumanSpeed = 0; 
	
	public List<Person> Persons = new ArrayList<Person>(); //내가 갈 경로!
	public List<mpoint> Path = new ArrayList<>(); // 나에게 입력된 경로!
	
	
	

	
	
	
	//TestList.add();
	


	
	public Person( double start)
	
	{

		this.WhereMove = 50; 
		System.out.println(this.WhereMove);
	}
	
	
}