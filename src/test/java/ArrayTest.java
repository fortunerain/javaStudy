import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class ArrayTest {
  @Test
  public void 배열_생성() {
    int[] arr = {1};

    // assertEquals 는 기대값, 실제 대상 순으로 파라미터가 되어 있어서 헷갈린다.
    assertEquals(1, arr[0]);

    // assertThat 은 실제값, 기대값 순으로 파라미터가 되어 있어서 직관적이다.
    // 대신 두번째 파라미터에는 Matcher 형태로 작성해야 한다.
    assertThat(arr[0], is(1));

  }

  @Test
  public void 배열_정렬() {
    int[] arr = {3, 4, 1, 2, 5};
    Arrays.sort(arr);

    assertThat(arr[0], is(1));
    assertThat(arr[1], is(2));
    assertThat(arr[2], is(3));
    assertThat(arr[3], is(4));
    assertThat(arr[4], is(5));
  }

  @Test
  public void 배열_역정렬_선택정렬() {
    int[] arr = {3, 4, 1, 2, 5};


    for (int i = 0; i < arr.length; i++) {
      // 기준이 되는 값 설정
      int max_index = i;
      int max = arr[i];
      for (int j = i + 1; j < arr.length; j++) {
        // 기준 값 보다 큰값이 있는지 파악
        if (arr[j] > max) {
          max_index = j;
        }
      }

      // i 번째 값과 max_index 번째의 값을 스왑.
      swap(arr, i, max_index);

    }

    System.out.println(Arrays.toString(arr));
  }

  private void swap(int[] arr, int i, int max_index) {
    int temp = arr[i];
    arr[i] = arr[max_index];
    arr[max_index] = temp;
  }
}
