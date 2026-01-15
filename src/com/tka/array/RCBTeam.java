package com.tka.array;

import java.util.Scanner;

public class RCBTeam{ 

	public static void main(String[] args) {
      Players [] rcb = new Players[11];
      rcb[0] = new Players(18,"Virat Kohli",67800,0,"RCB");
      rcb[1] = new Players(97,"Rajat Patidar",6800,0,"RCB");
      rcb[2] = new Players(16,"Devdatt Padikkal",47800,0,"RCB");
      rcb[3] = new Players(68,"Phill Salt",27890,0,"RCB");
      rcb[4] = new Players(55,"Jitesh Sharma",17800,0,"RCB");
      rcb[5] = new Players(4,"Tim Devid",51800,0,"RCB");
      rcb[6] = new Players(1,"Krunal Pandya",17000,100,"RCB");
      rcb[7] = new Players(93,"Romario Shephard",6800,69,"RCB");
      rcb[8] = new Players(6,"Jacob Bethall",7800,55,"RCB");
      rcb[9] = new Players(15,"Bhuvneshwar Kumar",8100,200,"RCB");
      rcb[10] = new Players(28,"Josh Hezlewood",32471,71,"RCB");
   
      
      System.out.println("\n");
     System.out.println("-------*** RCB Players *****---------");
     System.out.println("\n");
     for(Players p : rcb) {
    	 if(p!= null && p.getTname().equals("RCB")) {
    		 System.out.println(p);
    	 }
     }
     
     //Orange Cap Holder
     Players maxRunPlayer = null;
     for(Players p: rcb) {
    	 if(p!= null && p.getTname().equals("RCB")) {
    		 if(maxRunPlayer == null || p.getRuns()> maxRunPlayer.getRuns()) {
    			 maxRunPlayer = p;
    		 }
    	 }
     }
      System.out.println("\n Orange Cap Holder : " + maxRunPlayer);
      
      //Purple Cap Holder	
      
      Players maxWicketPlayer = null;
      for(Players p: rcb) {
     	 if(p!= null && p.getTname().equals("RCB")) {
     		 if(maxWicketPlayer == null || p.getRuns()> maxWicketPlayer.getRuns()) {
     			maxWicketPlayer = p;
     		 }
     	 }
      }
      
      System.out.println("\n Purple Cap Holder : " + maxWicketPlayer);
      System.out.println("\n");
      
      //Half Century Player
      System.out.println("---------- Half Century Players :----------- ");
      System.out.println("\n");
      for(Players p: rcb) {
      	 if(p!= null && p.getTname().equals("RCB")) {
      		if(p.getRuns()>=50 && p.getRuns() > 45000) {
      			System.out.println(p.getNm());
      			
      		}
      	 }
       }
      
      //Century Player
      System.out.println("\n");
      System.out.println(" -----------Century Players :----------- ");
      System.out.println("\n");
   
      for(Players p: rcb) {
      	 if(p!= null && p.getTname().equals("RCB")) {
      		if(p.getRuns()>=50 && p.getRuns() >= 55000) {
      			System.out.println(p.getNm());
      			
      		}
      	 }
       }
      
      Scanner sc = new Scanner(System.in);
      System.out.println("\n");
      System.out.println("Enter Jersey Number To Search : ");
      int Jersey = sc.nextInt();
      boolean found = false;
      for (Players p : rcb) {
    	  if(p!=null && p.getJn()==Jersey) {
    		  System.out.println("Player Found : ");
    		  System.out.println(p);
    		  found = true;
    		  break;
    	  }
      }
      
      if(!found) {
    	  System.out.println("Player Not Found For Jersey No:" + Jersey);
      }
      
	}

}
