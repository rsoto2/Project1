package com.mycompany.a2;

import com.codename1.ui.Command;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;

public class HyperSpaceCommand extends Command{
private GameWorld gw;
	
	public HyperSpaceCommand(GameWorld gw) 
	{
		super("Hyper Space");
		this.gw = gw;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		gw.jump();
	}

}
