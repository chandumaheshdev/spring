 package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	
	private FortuneService fortuneService;
	
	//create a no arg constructor
	
	public CricketCoach() {
	System.out.println("cricektcoach:inside no -arg constructor");
	}
	
	//our setter method
	public void setFortuneService(FortuneService fortuneService) {
		
		System.out.println("cricket coach: inside setter method-set fortune service ");
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice fast bowling for minutes "; 
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
