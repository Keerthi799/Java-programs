package Keerthi;

//Sub-child class FourWheeler to inherit the properties of child class RoadTransport and parent class Transport
class FourWheeler extends RoadTransport
{
//Sub-child class method
void fourWheelerMethod()
{
System.out.println("The Road transport is done by Four wheelers");
}

//Main method
public static void main(String[] args) 
{
FourWheeler f = new FourWheeler();

f.fourWheelerMethod(); 
f.roadTransportMethod(); 
f.transportMethod(); 
}
}
