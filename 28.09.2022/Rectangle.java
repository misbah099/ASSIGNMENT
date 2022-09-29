package firstJava;

public class Rectangle {
private int length;
private int breadth;
Rectangle(){
	length=10;
	breadth=4;
}
Rectangle(int length,int breadth){
	this.length=length;
	this.breadth=breadth;
}
double getArea() {
	return length*breadth;
}

}

