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
		WeatherView weatherView = new WeatherView();
		WeatherDTO weatherDTO = new WeatherDTO();
		Weatherinput weatherinput = new Weatherinput();
		WeatherDTO [] datadiv = null;
		boolean check = true;
		Scanner sc = new Scanner(System.in);		
		datadiv = weatherData.init();
		
		while(check) {
			System.out.println("1.날씨정보초기화");
			System.out.println("2.전국날씨정보");
			System.out.println("3.지역날씨검색");
			System.out.println("4.지역날씨추가");
			System.out.println("5.지역날씨삭제");
			System.out.println("6.종료");
			int num = sc.nextInt();
			switch(num) {
			case 1:
				datadiv = weatherData.init();
				System.out.println("초기화 완료");
				break;
			case 2:
				weatherView.view(datadiv);
				break;
			case 3:
				weatherDTO = weatherinput.search(datadiv);
				if(weatherDTO==null) {
					System.out.println("지역이 없습니다.");
				}else {
					weatherView.view(weatherDTO);
				}
				break;
			case 4:	
				datadiv = weatherinput.add(datadiv);
				System.out.println("추가완료");
				break;
			case 5:
				datadiv = weatherinput.remove(datadiv);
				System.out.println("삭제완료");
				break;
			default:
				System.out.println("종료합니다");
				check = false;
				break;
			}		
		}
	}
	
	
	


}