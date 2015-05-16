package ex22_05;

import java.util.Random;

public class Dices {
	private static final int TRY_COUNT = 10000;
	private int diceNum;
	private double[] comb;

	public Dices(int diceNum) {
		this.diceNum = diceNum;
		this.comb = new double[diceNum * 6];
		combination(0, 0);
	}

	public double[] roll(int rollCount) {
		double[] prob = new double[diceNum * 6];
		for (int c = 0; c < rollCount; c++) {
			int sum = 0;
			for (int num = 0; num < diceNum; num++) {
				sum += getRollResult("nextInt");
			}
			prob[sum - 1] += 1.0 / rollCount;
		}
		return prob;
	}

	public double[] getTheory() {
		double[] theory_prob = new double[diceNum * 6];
		for (int i = 0; i < theory_prob.length; i++) {
			theory_prob[i] = comb[i] / Math.pow(6, diceNum);
		}
		return theory_prob;
	}

	private void combination(int tmp, int sum){
	    if(tmp == diceNum)
	        comb[sum - 1] += 1;
	    else {
	    	tmp += 1;
	        for (int i = 1; i <= 6; i++)
	            combination(tmp, sum + i);
	    }
	}

	private int getRollResult(String method) {
		Random r = new Random();
		switch (method) {
		case "nextInt":
			return r.nextInt(6) + 1;
		case "nextLong":
			return (int) (Math.abs(r.nextLong()) % 6) + 1;
		case "nextDouble":
			return (int) ((r.nextDouble() * 10000) % 6) + 1;
		case "nextFloat":
			return (int) ((r.nextFloat() * 10000) % 6) + 1;
		case "nextGaussian":
			return (int) ((r.nextGaussian() * 10000) % 6) + 1;
		default: throw new IllegalArgumentException();
		}
	}

	public static void main(String[] args) {
		Dices dices = new Dices(2);
		double[] result = dices.roll(TRY_COUNT);
		double[] theory = dices.getTheory();
		System.out.println("Sum    Result    Theory");
		System.out.println("-----------------------");
		for (int i = dices.diceNum - 1; i < result.length; i++) {
			System.out.printf("%3d  %.6f  %6f\n", i+1, result[i], theory[i]);
		}
	}
}
