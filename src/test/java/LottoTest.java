import org.junit.Test;

import java.util.Random;

public class LottoTest {

  @Test
  public void 랜덤_숫자_만들기() {
    // 1. Math.random() 사용. 0.0 ~ 1.0 까지의 난수 발생.
    double random1 = Math.random();
    System.out.println(random1);

    // 1. Math.random() 사용. 10 까지의 난수 발생.
    int d = (int) (Math.random() * 10);
    System.out.println(d);

    // 2. Random 클래스 사용. 시드값으로 현재 시간을 줌.
    Random random = new Random(System.currentTimeMillis());
    // 2. 0 ~ 10까지의 난수 생성
    int nextInt = random.nextInt(10);
    System.out.println(nextInt);

  }

  @Test
  public void 로또_번호_생성() {
    // 1. Math.random() 사용
    generateLottoNumberByMathRandom();

    System.out.println();
    // 2. Random 클래스 사용
    generateLottoNumberByRandom();
  }

  private void generateLottoNumberByMathRandom() {
    for (int i = 0; i < 6; i++) {
      int num = (int) ((Math.random() * 45) + 1);
      System.out.println(num);
    }
  }

  private void generateLottoNumberByRandom() {
    Random random = new Random(System.currentTimeMillis());
    for (int i = 0; i < 6; i++) {
      int num = random.nextInt(45) + 1;
      System.out.printf("%d,", num);
    }
  }
}
