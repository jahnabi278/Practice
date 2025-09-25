package com.terra.taskallocator;

import java.util.List;

public class Agent {
	int taskCapacity = 2;
	int agentId;
	long dateTime;
	List<Task> taskList = null;

	public Agent(int taskCapacity, int agentId, List<Task> taskList) {
		this.taskCapacity = taskCapacity;
		this.agentId = agentId;
		this.dateTime = System.currentTimeMillis();
		this.taskList = taskList;
	}

	public Agent(int agentId, List<Task> taskList) {
		this.agentId = agentId;
		this.taskList = taskList;
	}

	public Agent() {

	}

	public int getTaskCapacity() {
		return taskCapacity;
	}

	public void setTaskCapacity(int taskCapacity) {
		this.taskCapacity = taskCapacity;
	}

	public int getAgentId() {
		return agentId;
	}

	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}

	public List<Task> getTaskList() {
		return taskList;
	}

	public void setTaskList(List<Task> taskList) {
		this.taskList = taskList;
	}

	public long getDateTime() {
		return dateTime;
	}

	public void setDateTime(long dateTime) {
		this.dateTime = dateTime;
	}

	public boolean isAvailable() {
		return taskList.size() < taskCapacity;
	}

	public int getActiveTaskCount() {
		return taskList.size();
	}

	public void assignTask(Task task) {
		taskList.add(task);
	}

	public void completeTask(Task task) {
		taskList.remove(task);
		if (taskList.isEmpty()) {
			dateTime = System.currentTimeMillis();
		}
	}

}
