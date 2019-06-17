package com.mycompany.a2;
import com.codename1.ui.Form;
import com.codename1.ui.Label;
import com.codename1.ui.TextField;
import com.codename1.ui.Toolbar;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.layouts.BoxLayout;
import com.codename1.ui.plaf.Border;
import com.codename1.ui.Command;
import com.codename1.ui.Container;
import com.codename1.ui.Display;
import com.codename1.*;
import com.codename1.charts.util.ColorUtil;

import java.lang.String;
import java.util.Observer;


public class Game extends Form {
	private GameWorld gw;
	private MapView mv;
	private PointsView pv;
	private GameButton asteroid, ssbutton, shipbutton, ispeedbutton, dsbutton, leftbutton, rightbutton, missilebutton, hyperbutton, refuelbutton;
	
	private AddAsteroidCommand addastro;
	private AddStationCommand addstation;
	private AddShipCommand addShip;
	private IncreaseSpeedCommand iSpeed;
	private DecreaseSpeedCommand dSpeed;
	private TurnLeftCommand tl;
	private TurnRightCommand rl;
	private FireMissileCommand m;
	private HyperSpaceCommand h;
	private ResupplyCommand r;
	
	
	
	private Container leftButtons;
	
	
	
	
	
	public Game()  {
		gw = new GameWorld();
//		mv = new MapView();
//		pv = new PointsView();
//		gw.addObserver(mv);
//		gw.addObserver(pv);
//		this.show();
//		//this.setTitle("Asteroid");
//		this.setLayout(new BorderLayout());
//		this.add(BorderLayout.CENTER, mv);
//		
//		this.add(BorderLayout.NORTH, pv);
//		
//		
//		leftButtons = new Container();
//		leftButtons.getAllStyles().setBgTransparency(0);
//		leftButtons.setLayout(new BoxLayout(BoxLayout.Y_AXIS));
//		leftButtons.getAllStyles().setBorder(Border.createLineBorder(3, ColorUtil.BLACK));
//		//leftButtons.getAllStyles().setBackgroundGradientStartColor(ColorUtil.BLACK);
//		leftButtons.getAllStyles().setBgColor(ColorUtil.GREEN);
//		
//
//		this.add(BorderLayout.WEST, leftButtons);
//		
//	
//		
//		
//		
//		asteroid = new GameButton("Asteroid");
//		addastro = new AddAsteroidCommand(gw);
//		asteroid.setCommand(addastro);
//		this.addKeyListener('a', addastro);
//		leftButtons.addComponent(asteroid);
//		
//		ssbutton = new GameButton("Station");
//		addstation = new AddStationCommand(gw);
//		ssbutton.setCommand(addstation);
//		this.addKeyListener('b', addstation);
//		leftButtons.addComponent(ssbutton);
//		
//		shipbutton= new GameButton("Ship");
//		addShip = new AddShipCommand(gw);
//		shipbutton.setCommand(addShip);
//		this.addKeyListener('s', addShip);
//		leftButtons.addComponent(shipbutton);
//		
//		ispeedbutton = new GameButton("Increase Speed");
//		iSpeed = new IncreaseSpeedCommand(gw);
//		ispeedbutton.setCommand(iSpeed);
//		this.addKeyListener('i', iSpeed);
//		leftButtons.addComponent(ispeedbutton);
//		
//		dsbutton = new GameButton("Decrease Speed");
//		dSpeed= new DecreaseSpeedCommand(gw);
//		dsbutton.setCommand(dSpeed);
//		this.addKeyListener('d', dSpeed);
//		leftButtons.addComponent(dsbutton);
//		
//		leftbutton = new GameButton("TurnLeft");
//		tl = new TurnLeftCommand(gw);
//		leftbutton.setCommand(tl);
//		this.addKeyListener('l', tl);
//		leftButtons.addComponent(leftbutton);
//		
//		rightbutton = new GameButton("Turn Right");
//		rl= new TurnRightCommand(gw);
//		rightbutton.setCommand(rl);
//		this.addKeyListener('r', rl);
//		leftButtons.addComponent(rightbutton);
//		
//		missilebutton = new GameButton("Fire Missile");
//		m = new FireMissileCommand(gw);
//		missilebutton.setCommand(m);
//		this.addKeyListener('f', m);
//		leftButtons.addComponent(missilebutton);
//		
//		hyperbutton = new GameButton("HyperSpace");
//		h = new HyperSpaceCommand(gw);
//		hyperbutton.setCommand(h);
//		this.addKeyListener('f', h);
//		leftButtons.addComponent(hyperbutton);
//		
//		refuelbutton = new GameButton("ReSupply");
//		r = new ResupplyCommand(gw);
//		refuelbutton.setCommand(r);
//		this.addKeyListener('n', r);
//		leftButtons.addComponent(refuelbutton);
		
//		ssbutton = new GameButton("Pause");
//		addstation = new AddStationCommand(gw);
//		ssbutton.setCommand(addstation);
//		this.addKeyListener('b', addstation);
//		leftButtons.addComponent(ssbutton);
//		
//		shipbutton= new GameButton("Exit");
//		addShip = new AddShipCommand(gw);
//		shipbutton.setCommand(addShip);
//		this.addKeyListener('s', addShip);
//		leftButtons.addComponent(shipbutton);
		
		
		
//		this.show();
//		gw.init();
//		play();
//		
//		
//		//cContainer = new Container();
//		
//		
//		Toolbar sideMenu = new Toolbar();
//		sideMenu.setUIID("ToolBar");
//		sideMenu.getAllStyles().setBgTransparency(0);
//		sideMenu.getAllStyles().setBorder(Border.createLineBorder(3, ColorUtil.rgb(100, 0, 0)));
//		sideMenu.getAllStyles().setBackgroundGradientStartColor(ColorUtil.GRAY);
//		this.setToolbar(sideMenu);
//		sideMenu.setTitle("Asteroid Game");
//		sideMenu.getTitleComponent().getAllStyles().setFgColor(ColorUtil.MAGENTA);
//		sideMenu.addCommandToOverflowMenu(m);
//		
//		Command newGame = new Command("Ruth's crusty ass");
//		sideMenu.addCommandToLeftSideMenu(newGame);
		
		gw.init();
		play();
		quit();
	}
	

	
	private void play() {
		
		Label myLabel = new Label("Enter a Command: ");
		this.addComponent(myLabel);
		final TextField myTextField = new TextField();
		this.addComponent(myTextField);
		this.show();
		
		myTextField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				String sCommand = myTextField.getText().toString();
				myTextField.clear();
				if(!sCommand.isEmpty()) {
				switch(sCommand.charAt(0)) {
				case 'a': 
					gw.addNewAsteroid();
					break;
				case 'y': 
					gw.newNPS();
					break;
				case 'b':
					gw.newSpaceStation();
					break;
				case 's':
					gw.newPS();
					break;
				case 'f': 
					gw.fireMissile();
					break;
				case 'L': 
					gw.launchMissile();
					break;
				case 'm':
					gw.printMap();
					break;
				case 'p':
					gw.printDisplay();
					break;
				case '>': 
					//gw.turnMissileLauncher();
					//gw.ML();
					gw.turnPSML();
					break;
				case 'n':
					gw.reSupply();
					break;
				case 'k':
					//gw.killAsteroid();
					gw.playerShipMissileKillAsteroid(); //works
					break;
				case 'e':
					//gw.killNonPlayerShip();
					//gw.playerShipMissileKillAsteroid(); 
					gw.removeMissileAndNPS(); //works
					break;
				case 'E':
					//gw.killPlayerShip();
					gw.removeMissileAndPS(); //works
					break;
				case 'c':
					//gw.asteroidCollide();
					gw.removeAstAndPS(); //works
					break;
				case 'h':
					//gw.shipcollide();
					gw.removeNPSAndPS(); //works
					break;
				case 'x':
					gw.removeAsteroids();//works
					//gw.removeAstAndAst();
					break;
				case 'I':
					//gw.turnLeft();
					gw.removeAstAndNPS(); //works
					break;
				case 'l':
					gw.turnShipLeft();
					break;
				case 'i':
					gw.speedUpShip();
					break;
				case 'r':
					gw.turnShipRight();
					break;
				case 'd':
					gw.slowUpShip();
					break;
				case 't':
					gw.tick();
					break;
				case 'j':
					gw.jump();
					break;
					
				
				}
				}
			}
		});
				
		
	}	
	
public void quit()
{
	Label myLabel2 = new Label("Do you want to quit? y/n:  ");
	this.addComponent(myLabel2);
	final TextField myTextField2 = new TextField();
	this.addComponent(myTextField2);
	this.show();
	
	myTextField2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent evt) {
			String sCommand = myTextField2.getText().toString();
			myTextField2.clear();
			if(!sCommand.isEmpty() && sCommand.length() == 1) {
			switch(sCommand.charAt(0)) {
			case 'y':
				gw.quit();
				break;
			case 'n':
				System.out.println("Enter command: ");
				break;
				
			
			}
			}
		}
});
	
	

		
		
		
		
		
		
	}
}
