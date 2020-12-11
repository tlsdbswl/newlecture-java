package part2.ex2.탑다운예제;

public class Program {

	public static void main(String[] args) {

		/*
		 * 로또 관리 프로그램
		 * 1. 번호 자동 생성
		 * 2. 번호 수동 생성 
		 * 3. 내 로또 번호 보기 
		 * 4. 종료 
		 */
		
		int[][] lottos = null;
		int menu;
		boolean running = true;
		
		while(running){
		menu = inputMenu();
		
		switch (menu) {
		case 1:
			lottos = createLottosAuto();
			break;
		case 2:
			lottos = createLottosMenual();
			break;
		case 3:
			printLottos(lottos);
			break;
		default:
			running = false;
			break;
		}
		}
	}

	private static void printLottos(int[][] lottos) {
		
	}

	private static int[][] createLottosMenual() {
		return null;
	}

	private static int[][] createLottosAuto() {
		return null;
	}

	private static int inputMenu() {
		
		return 0;
	}

}
