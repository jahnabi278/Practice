package com.terra.taskallocator;

public class Task {

	int taskId;
	String taskName;

	public Task(String taskName) {
		this.taskName = taskName;
	}

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

}
