package view;

import java.util.List;
import java.util.Map;
import lotto.Lotto;
import lotto.Result;

public class OutputView {

    private OutputView() {}

    public static void printLottos(List<Lotto> lottos) {
        System.out.println(lottos.size() + "개를 구매했습니다.");
        for (Lotto lotto : lottos) {
            System.out.println(lotto);
        }
        System.out.println();
    }

    public static void printResult(int ticketCount, Map<Result, Integer> resultCount) {
        System.out.println("당첨 통계");
        System.out.println("---");
        System.out.println("3개 일치 (5,000원) - " + resultCount.getOrDefault(Result.FIFTH, 0) + "개");
        System.out.println("4개 일치 (50,000원) - " + resultCount.getOrDefault(Result.FOURTH, 0) + "개");
        System.out.println("5개 일치 (1,500,000원) - " + resultCount.getOrDefault(Result.THIRD, 0) + "개");
        System.out.println("5개 일치, 보너스 볼 일치 (30,000,000원) - " + resultCount.getOrDefault(Result.SECOND, 0) + "개");
        System.out.println("6개 일치 (2,000,000,000원) - " + resultCount.getOrDefault(Result.FIRST, 0) + "개");
    }
}
