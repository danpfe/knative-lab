package examples.knative;

import java.util.Arrays;

public class SumRequest {
  private int[] numbers;

  public int[] getNumbers() {
    return numbers;
  }

  public void setNumbers(int[] numbers) {
    this.numbers = numbers;
  }

  @Override
  public String toString() {
    return "SumRequest{" +
        "numbers=" + Arrays.toString(numbers) +
        '}';
  }
}
