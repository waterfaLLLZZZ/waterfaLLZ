//Система Управления доставкой товара.
//Id - Идентификатор
//name - название товара
//courier - курьер
//dateTime - Дата и время (String);
//type - тип заказа
package re;

public class TestRoom {
	public static void main(String[] args){
		Room room=new Room(101,Бургеры,Иван,25,1);
		System.out.println(room.toString());

		}
}
