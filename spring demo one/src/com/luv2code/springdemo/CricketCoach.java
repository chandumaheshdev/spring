 package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	
	private FortuneService fortuneService;
	
	//add new fields for emailAddress and team
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		
		System.out.println("cricket coach: inside setter method-set email address ");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("cricket coach: inside setter method-setTeam ");
		this.team = team;
	}

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
