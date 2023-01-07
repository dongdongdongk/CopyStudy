package weatherStudy;

import java.util.Scanner;

public class WeatherController {

	//start 
		//1.날씨정보초기화 ->init()
		//	초기화 완료 되었습니다.
		//2.전국날씨정보	-> view()
		//3.지역날씨검색 
		//	없으면 도시 정보가 없습니다. 출력
		//4.지역날씨추가
		//5.지역날씨삭제
		//6.종	 료
	public void Start() {
		WeatherData weatherData = new WeatherData();
		WeatherDTO weatherDTO = new WeatherDTO();
		Scanner sc = new Scanner(System.in);		
		System.out.println("1.날씨정보초기화");
		System.out.println("2.전국날씨정보");
		System.out.println("3.지역날씨검색");
		System.out.println("4.지역날씨추가");
		System.out.println("5.지역날씨삭제");
		System.out.println("6.종료");
		
		int num = sc.nextInt();
		switch(num) {
		case 1:
			weatherData.init();
			
		}
	
	}
	
	
	


}