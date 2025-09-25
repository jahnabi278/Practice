package com.terra.taskallocator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TaskAllocationSystem {
	static List<Agent> agentList = new ArrayList<>();

	public static void addAgent(Agent agent) {
		agentList.add(agent);
	}

	public static Agent allocateTask(Task task) {
		return agentList.stream().filter(Agent::isAvailable)
				.min(Comparator.comparingInt(Agent::getActiveTaskCount).thenComparingLong(Agent::getDateTime))
				.map(agent -> {agent.assignTask(task)return agent;}).orElse(null);
	}

	public static void main(String[] args) {
		Agent a1 = new Agent();
		a1.setAgentId(001);
		Agent a2 = new Agent();
		a2.setAgentId(002);

		addAgent(a1);
		addAgent(a2);

		Task t1 = new Task("task1");
		Task t2 = new Task("task2");
		Task t3 = new Task("task3");

		System.out.println("Allocating t1 -> " + allocateTask(t1).getAgentId());
		System.out.println("Allocating t2 -> " + allocateTask(t2).getAgentId());
		System.out.println("Allocating t3 -> " + allocateTask(t3).getAgentId());

	}

}
/**
 * Design and implement a Scalable Task Allocation System for customer success
 * agents.
 * 
 * 
 * Each agent has a configurable maximum task capacity (default = 2).
 * 
 * 
 * A task should be assigned to an available agent based on:
 * 
 * 
 * Allotment Condition: Only assign if agent’s active tasks < capacity.
 * 
 * 
 * Tie-breaking Condition:
 * 
 * 
 * Fewer active tasks first.
 * 
 * 
 * If tied, pick the agent who has been idle the longest.
 * 
 * 
 * 
 */
