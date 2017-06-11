package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	
	private FortuneService fortuneservice;
	
	public TrackCoach(){};

	public TrackCoach(FortuneService fortuneservice) {
		
		this.fortuneservice = fortuneservice;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "run20k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "just do it "+fortuneservice.getFortune();
	}

	public void doMyStartupStuff(){
		System.out.println("trackcoach:  inside method doMyStartupstuff");
		
	}

//add destroy method 
	public void doMycleanStuffyoyoy(){
		
		System.out.println("trackCoach:inside method doMycleanStuff");
	}


}
