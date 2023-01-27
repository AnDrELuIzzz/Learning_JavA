package entities;

public class retangle {
	public double Width;
	public double Heigth;
	
	public double areaRet()
	{
		return Width * Heigth;
	}
	
	public double perimetro()
	{
		return 2 * (Width + Heigth);
	}
	
	public double diagona()
	{
		return Math.sqrt(Math.pow(Width, 2) + Math.pow(Heigth, 2));
	}
}
