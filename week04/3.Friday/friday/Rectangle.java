package friday;

public final class Rectangle {

	public static void main(String[] args) {
		Point upperLeft=new Point(1,5);
		Point lowerRight=new Point(5,2);
		Rectangle rectangle=new Rectangle(upperLeft, lowerRight);
		Rectangle copy=new Rectangle(rectangle);
		rectangle.display4Vertices();
		rectangle.display4Edges();
		System.out.println("width: "+rectangle.width());
		System.out.println("height: "+rectangle.height());
		System.out.println("center: "+ rectangle.centerOfRectangle());
		System.out.println("Perimeter: "+rectangle.getPerimeter());
		System.out.println("Area: "+rectangle.getArea());
		System.out.println("Rectangle: "+ rectangle.toString());
		System.out.println(rectangle.equals(copy));
		System.out.println("Hashcode: "+ rectangle.hashCode());

	}

	private Point upperLeft;
	private Point lowerRight;

	//constructor with 2 arguments of type Point - the upper left and lower right points
	Rectangle(Point upperLeft,Point lowerRight){
		if(upperLeft.getX()==lowerRight.getX()||upperLeft.getY()==lowerRight.getY()){
			System.out.println("Points are on the same axis.");
		}else{
			this.upperLeft=upperLeft;
			this.lowerRight=lowerRight;
		}
	}
	//constructor that makes a copy of a Rectangle
	Rectangle(Rectangle other){	
		this.upperLeft=other.upperLeft;
		this.lowerRight=other.lowerRight;	
	}
	//4 methods for displaying 
	//the 4 vertices of the rectangle (of type Point). I.e. getUpperLeft, getLowerLeft, etc.
	public Point getUpperLeft() {
		return upperLeft;
	}

	//find upper right point- x= center.X + halfDiagonal.Y; y=center.Y - halfDiagonal.X
	public Point getUpperRight() {
		return new Point(centerOfRectangle().getX() + halfDiagonal().getY(),
				centerOfRectangle().getY() - halfDiagonal().getX());
	}

	public Point getLowerRight() {
		return lowerRight;
	}

	//find lower left t point- x= center.X - halfDiagonal.Y; y=center.Y + halfDiagonal.X
	public Point getLowerLeft() {
		return new Point(centerOfRectangle().getX() - halfDiagonal().getY(),
						centerOfRectangle().getY() + halfDiagonal().getX());
	}
	
	public void display4Vertices(){
		System.out.println("4 vertices: "+
				getUpperLeft().toString()+", "+
				getUpperRight().toString()+", "+
				getLowerRight().toString()+", "+
				getLowerLeft().toString());
	}
	
	//4 methods for displaying the 4 edges of the rectangle (of type LineSegment)
	public LineSegment getUp() {
		return new LineSegment(getUpperLeft(), getUpperRight());
	}

	public LineSegment getDown() {
		return new LineSegment(getLowerLeft(), getLowerRight());
	}

	public LineSegment getLeft() {
		return new LineSegment(getUpperLeft(), getLowerRight());
	}

	public LineSegment getRight() {
		return new LineSegment(getUpperRight(), getLowerRight());
	}
	
	public void display4Edges(){
		System.out.println("4 edges: "+
				getLeft().toString()+", "+
				getUp().toString()+", "+
				getRight().toString()+", "+
				getDown().toString());
	}
	
	//2 methods for dispalying the width and height of the rectangle
	public double width(){
		return getUp().getLength();
	}
	
	public double height(){
		return getLeft().getLength();
	}
	
	//method for displaying the center of the rectangle
	public Point centerOfRectangle(){
		return new Point((getUpperLeft().getX() + getLowerRight().getX()) /2, 
				         (getUpperLeft().getY() + getLowerRight().getY()) /2);
	}
	
	//help method for calculating the other two vertices
	public Point halfDiagonal(){
		return new Point((getUpperLeft().getX() - getLowerRight().getX()) /2, 
				         (getUpperLeft().getY() - getLowerRight().getY()) /2);
	} 
	
	//methods getPerimeter(), getArea()
	public double getPerimeter(){
		return 2*width() + 2*height();
	}
	
	public double getArea(){
		return width() * height();
	}
	
	//Override toString(): Rectangle[(x,y), (height,width)]
	public String toString(){
		return new String("[("+centerOfRectangle().toString()+", ("+height()+","+width()+")]");
	
	}
	
	//Override equals()
	public boolean equals(Rectangle other){
		return this.centerOfRectangle().equals(other.centerOfRectangle()) && 
			   this.width()==other.width() &&
			   this.height()==other.height();
	}
	
	//Override hashCode()
	public int	hashCode(){
		int hash = 17;
	    hash = hash * 23 + getUp().hashCode();
	    hash = hash * 23 + getLeft().hashCode();
	    return hash;
	}
	
}
