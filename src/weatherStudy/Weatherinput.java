package weatherStudy;

import java.util.Scanner;

public class Weatherinput {

	//search
		//배열을 받고, 키보드로부터 검색할 도시명을 입력 받음
		//찾은 DTO를 리턴 -> Controller에 해당 지역 정보들 출력
		//없으면 null값 리턴
	Scanner sc = new Scanner(System.in);
	public WeatherDTO search(WeatherDTO[] datadiv ) {
		System.out.println("도시명 입력");
		String city = sc.next();
		WeatherDTO wetherDTO = null;
		for(int i=0;i<datadiv.length;i++) {
			if(datadiv[i].getCity().toUpperCase().equals(city.toUpperCase())) {
				wetherDTO = datadiv[i];
			}
		}
		return wetherDTO;	
	}
	
	
	//add
		//배열을 받고, 키보드로부터 정보들을 입력 받음
		//배열에 추가하고 배열을 리턴
	public WeatherDTO[] add(WeatherDTO[] datadiv) {
		WeatherDTO [] wetherDTO2 = new WeatherDTO[datadiv.length+1];
		System.arraycopy(datadiv, 0, wetherDTO2, 0, datadiv.length);
		WeatherDTO weatherDTO = new WeatherDTO();
		System.out.println("도시 입력");
		weatherDTO.setCity(sc.next());
		System.out.println("기온 입력");
		weatherDTO.setGion(sc.next());
		System.out.println("날씨 입력");
		weatherDTO.setStatus(sc.next());
		System.out.println("미세먼지 입력");
		weatherDTO.setMise(sc.next());
		wetherDTO2[datadiv.length] = weatherDTO;
		datadiv = wetherDTO2;
		return datadiv;
		
			
		}
	}
	
	//remove
		//배열을 받고, 키보드로부터 삭제할 도시명을 입력 받음
		//배열에서 삭제하고 배열을 리턴

