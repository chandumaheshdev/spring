package com.luv2code.springdemo;

public class BaseballCoach implements Coach{

	//define a private field for the dependency
	
	private FortuneService fortuneservice;
	
	//define a constructor for dependency injection
	
	public BaseballCoach(FortuneService theFortuneService){
		
		fortuneservice=theFortuneService;
	}
	
	public String getDailyWorkout(){
		return "spend 30 min on batting";
	}

	@Override
	public String getDailyFortune() {
		
		//use my fortuneservice to get fortune
		return fortuneservice.getFortune();
	}
}
