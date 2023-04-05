class Flower
{
	public String colour="Yellow";
	private String quantity="100 piece";
	public void setQuantity(String Quantity)
	{
		this.Quantity=Quantity;
	}
	public String getQuantity()
	{
		return Quantity;
	}

	class Flower1
	{
		public static void main(String[]args)
		{
			Flower f=new Flower();
			System.out.println(f.colour);
			f.setQuantity("200 piece");
			System.out.println(f.getQuantity);
		}
	}

	

