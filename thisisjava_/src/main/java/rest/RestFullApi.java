package main.java.rest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

public class RestFullApi {
	public void getRestData() {
		URL url = null;
		String readLine = null;
		StringBuilder buffer = null;
		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWriter = null;
		HttpURLConnection urlConnection = null;

		int connTimeout = 5000;
		int readTimeout = 3000;
		// ? 뒤는 변수
		String apiUrl = "https://api.odcloud.kr/api/3079829/v1/uddi:5fb539ec-5c69-4d36-80f3-8ec18dd9037e?page=1&perPage=10&returnType=XML&serviceKey=NFE90VzxK%2BLn%2BSkals9L%2F7Xq8LFY98w%2F7C9o%2Fq%2Fyg%2Fs3Dk6qr2DC0jq9Ym2%2FsmO8dI02dvV%2Bkv205YOfMQjuHw%3D%3D";
		// 각자 상황에 맞는 IP & url 사용

		try
		{
			url = new URL(apiUrl);
			urlConnection = (HttpURLConnection) url.openConnection();
			urlConnection.setRequestMethod("GET");
			urlConnection.setConnectTimeout(connTimeout);
			urlConnection.setReadTimeout(readTimeout);
			urlConnection.setRequestProperty("Accept", "application/json;");

			buffer = new StringBuilder();
			if (urlConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
				bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(), "UTF-8"));
				while ((readLine = bufferedReader.readLine()) != null) {
					buffer.append(readLine).append("\n");
				}
				
				System.out.println("결과 : "+buffer.toString());
				
			} else {
				buffer.append("code : ");
				buffer.append(urlConnection.getResponseCode()).append("\n");
				buffer.append("message : ");
				buffer.append(urlConnection.getResponseMessage()).append("\n");
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}finally{
			try {
				if (bufferedWriter != null) {
					bufferedWriter.close();
				}
				if (bufferedReader != null) {
					bufferedReader.close();
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
//		System.out.println("결과 : "+buffer.toString());
	}

}
