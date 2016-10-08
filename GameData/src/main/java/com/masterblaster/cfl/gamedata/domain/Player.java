package com.masterblaster.cfl.gamedata.domain;

import java.util.List;
import java.util.Map;

public class Player {
	
	private long playerId;
	
	private String firtName;
	private String lastName;
	private String commonName;
	
	private Map<FormatType,PlayerStatistics> playerRecord;
	
	private List<Team> majorTeams;
	
	private CurrentFormFactors currentFormFactors;
	
	

}
