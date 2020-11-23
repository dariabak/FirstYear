package portfolio6;

class BankAccount {

	int balance(int balance, int years) {
		double interestRate = 0;

		if (years >= 1 && years <= 10) {
			if (balance <= 1000 && balance > 0) {
				interestRate = 0.005;
			} else if (balance >= 1001 && balance <= 10000) {
				interestRate = 0.015;
			} else if (balance >= 10001 && balance <= 50000) {
				interestRate = 0.025;
			} else {
				return -1;
			}
		} else {
			return -1;
		}

		double newCapital = balance * Math.pow(1.0 + interestRate,years);
		return (int) (newCapital + 0.5);
	}
}
