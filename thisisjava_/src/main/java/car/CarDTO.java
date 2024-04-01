package main.java.car;
// 프레임워크 들어갈때 사용함
// vo 데이터 읽고 쓰기만 가능
// dto 데이터 변경
//@lombok : 어노테이션 / vo나 dto위에 붙어있다
public class CarDTO {
	String handle;
	public String getHandle() {
		return handle;
	}
	public void setHandle(String handle) {
		if(handle.equals("핸들")) {
			this.handle = handle;
		} else {
			this.handle = "핸들이 아닙니다";
		}
	}
	public String getHandle2() {
		return handle2;
	}
	public void setHandle2(String handle2) {
		this.handle2 = handle2;
	}
	public String getHandle3() {
		return handle3;
	}
	public void setHandle3(String handle3) {
		this.handle3 = handle3;
	}
	public int getHandle4() {
		return 99;
	}
	public void setHandle4(int handle4) {
		if (handle4 ==20) {
			this.handle4 = 20;
		}		
	}
	public String getHandle5() {
		return handle5;
	}
	public void setHandle5(String handle5) {
		this.handle5 = handle5;
	}
	String handle2;
	String handle3;
	int handle4;
	String handle5;
}
