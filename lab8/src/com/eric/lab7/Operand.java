package com.eric.lab7;

public class Operand {

	public int operand;

	public Operand(int operand) {
		this.operand = operand;
	}

	public int getOperand() {
		return operand;
	}

	public void setOperand(int operand) {
		this.operand = operand;
	}

	public String toString() {
		return " " + this.operand;
	}

}
