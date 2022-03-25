package com.github.pnpninja.cultfitclassbooker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KeepAliveController {

	@Autowired
	private ScheduledBookingTask task;
	
	@RequestMapping(value="/")
	public int keepAlive() {
		return 200;
	}
	
	@RequestMapping(value="/trynow")
	public void tryNow() {
		// ScheduledBookingTask task = new ScheduledBookingTask();
		task.bookClassesInAdvance();
	}
	

}
