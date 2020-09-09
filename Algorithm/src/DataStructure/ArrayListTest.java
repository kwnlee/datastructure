package DataStructure;

//ArrayList Class를 선언
class ArrayList {
	private Object[] data;
	private int size;
	//다음 data를 추가할 위치를 기억하는 index
	private int index;

	
	public ArrayList() {
		//배열의 size를 1로 초기화
		this.size = 1;
		//size만큼 배열 방을 생성
		this.data = new Object[this.size];
		//새로 들어오는 data는 data[0]에 저장되도록  
		this.index = 0;
	}

	//배열에 data추가
	public void add(Object obj) {
		System.out.println("index : " + this.index + ", size : " + this.size + " , data size : " + this.data.length);
		//배열이 다 찼는지 비교
		if (this.index == this.size - 1) {
			//full이면 doubling, 계속 추가 
			doubling();
		}
		//공간이 있으면 가져온 data를 맨 끝에 추가
		data[this.index] = obj;
		//데이터가 추가되었으므로 index 늘려줌
		this.index++;
	}

	private void doubling() {
		//doubling은 현재 size * 2
		this.size = this.size * 2;
		//새로운 배열방은 기존 배열방의 크기를 두 배로 늘린 것
		Object[] newData = new Object[this.size];
		for (int i = 0; i < data.length; i++) {
			//for문 돌면서 기존 배열 data를 모두 복사 
			newData[i] = data[i];
		}
		//이제 배열의 주소가 현재 데이터
		this.data = newData;
		System.out.println("*** index : " + this.index + ", size : " + this.size + " , data size : " + this.data.length);

	}

	//index번호로 데이터 가져오는 get 함수 
	public Object get(int i) throws Exception {
		//인덱스번호가 범위 바깥일 때 예외처리 
		if (i > this.index - 1) {
			throw new Exception("ArrayIndexOutofBound");
		} else if (i < 0) {
			throw new Exception("Nagative Value");
		}
		//아닌 경우 현재 배열방의 data 반환 
		return this.data[i];
	}

	//index번호로 데이터 삭제하는 remove 함수 
	public void remove(int i) throws Exception {
		if (i > this.index - 1) {
			throw new Exception("ArrayIndexOutofBound");
		} else if (i < 0) {
			throw new Exception("Nagative Value");
		}
		System.out.println("data removed : " + this.data[i]);
		//삭제할 data 기준으로 한 칸씩 앞으로 shift해서 빈 자리 메꾸기
		for (int x = i; x < this.data.length - 1; x++) {
			data[x] = data[x + 1];
		}
		this.index--;

	}

}

public class ArrayListTest {
	public static void main(String[] args) throws Exception {
		ArrayList al = new ArrayList();
		al.add("0");
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		al.add("5");
		al.add("6");
		al.add("7");
		al.add("8");
		al.add("9");
		System.out.println(al.get(5));
		al.remove(5);
		System.out.println(al.get(5));

	}

}
