package com.mycompany.a2;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;

public class DecreaseSpeedCommand extends Command {

private GameWorld gw;
	
	public DecreaseSpeedCommand(GameWorld gw) 
	{
		super("Decrease Speed");
		this.gw = gw;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		gw.slowUpShip();
	}

}
