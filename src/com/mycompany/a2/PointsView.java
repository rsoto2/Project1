package com.mycompany.a2;

import java.util.Observable;
import java.util.Observer;

import com.codename1.charts.util.ColorUtil;
import com.codename1.ui.Container;
import com.codename1.ui.Label;
import com.codename1.ui.layouts.BoxLayout;

public class PointsView extends Container implements Observer{

	private Label pointsValueLabel;
	private Label missileCntValue;
	private Label elapsedTimeValue;
	private int livesValueLabel;
	
	
	
	public PointsView()
	{
		Label pointsTextLabel = new Label("Points: ");
		Label missileCntValue = new Label("Missiles: ");
		Label elapsedTimeValue = new Label("Time: ");
		
		pointsValueLabel = new Label("XXX");
		pointsTextLabel.getAllStyles().setFgColor(ColorUtil.rgb(0, 0, 255));
		
		//missileCntValue = new Label("XXX");
		missileCntValue.getAllStyles().setFgColor(ColorUtil.rgb(0, 0, 255));
		
		elapsedTimeValue.getAllStyles().setFgColor(ColorUtil.rgb(0, 0, 225));
		
		
		
		Container myContainer = new Container();
		myContainer.setLayout(new BoxLayout(BoxLayout.X_AXIS));
		
		myContainer.add(pointsTextLabel);
		this.add(myContainer);
		this.add(missileCntValue);
		this.add(elapsedTimeValue);
	}



	@Override
	public void update(Observable observable, Object data) throws IllegalArgumentException{
		// TODO Auto-generated method stub
		IGameWorld gw = (IGameWorld) data;
		this.pointsValueLabel.setText(" " + gw.getPlayerScore());
		this.missileCntValue.setText(" "  + gw.getMissileCount());
		this.elapsedTimeValue.setText(" " + gw.getElapseTime());
		this.repaint();
		
		
	}
	
}
