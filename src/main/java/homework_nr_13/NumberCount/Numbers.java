package homework_nr_13.NumberCount;

public class Numbers {
    public int countDivisibleBy7Numbers(int interiorLimit, int superiorLimit) throws InvalidRangeException {
        int count = 0;
        for (int i = interiorLimit; i <= superiorLimit; i++) {
            if (i % 7 == 0) {
                count++;
            }
        }
        if (interiorLimit < superiorLimit) {
            return count;

        } else {
            throw new InvalidRangeException("Invalid range");
        }
    }
}
