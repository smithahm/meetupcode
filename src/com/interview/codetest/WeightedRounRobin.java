package com.interview.codetest;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WeightedRounRobin {

	Scanner sc = new Scanner(System.in);
	List<ServerDetails> process;
	int size, i = -1, currentWeight = 0, maxValue, gcd;

	WeightedRounRobin(int size) {
		this.size = size;
		process = new ArrayList<>();

	}

	public void execute() {
		System.out.print("Enter the Process name and weight in the format X:1 ");
		for (int j = 0; j < size; j++) {
			String[] input = sc.nextLine().split(":");
			process.add(new ServerDetails(input[0], Integer.parseInt(input[1])));
		}
		maxValue = getMaxValue(process);
		gcd = getGcdOfArray(process);

		System.out.println("Please enter number of times you want to run the program");
		int timesToRun = sc.nextInt();
		for (int j = 0; j < timesToRun; j++) {
			i = (i + 1) % size;
			if (i == 0) {
				currentWeight = currentWeight - gcd;
				if (currentWeight <= 0) {
					currentWeight = maxValue;
					if (currentWeight == 0) {
						return;
					}
				}
			}
			int val = process.get(i).weight;
			if (val >= currentWeight) {
				System.out.print(process.get(i).name + "\t");
			}
		}

	}

	private int gcd(int x, int y) {
		return (y == 0) ? x : gcd(y, x % y);

	}

	public int getGcdOfArray(List<ServerDetails> input) {
		int result = 0;
		for (ServerDetails s : input) {
			result = gcd(result, s.weight);
		}
		return result;
	}

	private int getMaxValue(List<ServerDetails> input) {
		int maxValue = Integer.MIN_VALUE;
		for (ServerDetails s : input) {
			if (s.weight > maxValue) {
				maxValue = s.weight;

			}
		}
		return maxValue;
	}

	public static void main(String arg[]) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of process:");
		int n = s.nextInt();
		WeightedRounRobin robin = new WeightedRounRobin(n);
		robin.execute();

	}
}

class ServerDetails {
	int weight;
	String name;

	public ServerDetails(String serverName, int serverWeight) {
		this.weight = serverWeight;
		this.name = serverName;

	}
}