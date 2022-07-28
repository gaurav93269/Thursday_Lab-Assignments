package com.Citrus.hotel.Model;

public class HotelModel
{
	private int RoomNumber;
	private String RoomType;
	
	public HotelModel(int roomNumber, String roomType) // Parameterized Constructor
	{
		super(); //to use to call super class and access superclass constructor
		
		this.RoomNumber = roomNumber;//to refers to current object
		this.RoomType = roomType; 
	}
	
	//to Access  and update the value of private variable use Getter and Setter.
     public int getRoomNumber() 
	{
		return RoomNumber;
	}

	public void setRoomNumber(int roomNumber) 
	{
		RoomNumber = roomNumber;
	}

	public String getRoomType() 
	{
		return RoomType;
	}

	public void setRoomType(String roomType)
	{
		RoomType = roomType;
	}
	@Override
	public String toString() {
		return "HotelModel [roomNumber=" + RoomNumber + ", roomType=" + RoomType + "]";
	}
}

======================================================================
package com.Citrus.hotel.view;
import com.yadav.hotel.Model.HotelModel;
import com.yadav.hotel.Service.HotelService;

import java.util. Scanner;
public class HotelView 
{
	public static void main(String[] args)
	{
		HotelService hotelService=new HotelService();  //key of hotel Service
		Scanner sc=new Scanner(System.in); // To take input from user
		Customer customer =new Customer();
		Room room =new Room();
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter Room Number");  //  TO Accept the Room number
			int roomNumber = sc.nextInt();
			System.out.println("Enter Room Type");  // to Accept the  Room type
			String roomType = sc.next();
			System.out.println("Enter the choice of room type");
			System.out.println("Choose 1: Singlebed Non AC 2: Singlebed  AC 3: Doublebed Non AC 4:Doublebed AC ");
			int roomType10 = sc.nextInt();
			switch(RoomType)
			{

			   case 1:
			   {				   
			       System.out.println("You Have Choosen Singlebed Non AC ");
			       String roomtype = "AC";
			       room.setroomType(roomtype);
			       System.out.println("Enter your Name");
			       String customerName = sc.next();
			       customer.set.customername( customerName);
			       System.out.println("Enter your Age");
			       int customerAge = sc.nextInt();
			       customer.set.customerage( customerAge);
			       System.out.println("Enter your gender ");
			       char customerGender = sc.next().charAt(0);
			       customer.set.customergender( customerGender);
			   }
			       break;

			   case 2:
			   {
				   System.out.println("You Have Choosen Singlebed Non AC ");
				   String roomtype2 = "AC";
				   room.setroomType(roomtype2);
				   System.out.println("Enter your Name");
				   String customerName2 = sc.next();
				   customer.set.customername( customerName2);
				   System.out.println("Enter your Age");
				   int customerAge2 = sc.nextInt();
				   customer.set.customerage( customerAge2);
				   System.out.println("Enter your gender ");
				   char customerGender2 = sc.next().charAt(0);
				   customer.set.customergender( customerGender2);
			   }   
			   break;


			   case 3:
			   {
				   System.out.println("You Have Choosen Singlebed Non AC ");
				   String roomtype3 = "AC";
				   room.setroomType(roomtype3);
				   System.out.println("Enter your Name");
				   String customerName3 = sc.next();
				   customer.set.customername( customerName3);
				   System.out.println("Enter your Age");
				   int customerAge3 = sc.nextInt();
				   customer.set.customerage( customerAge3);
				   System.out.println("Enter your gender ");
				   char customerGender3 = sc.next().charAt(0);
				   customer.set.customergender( customerGender3);
			   }
			   break;

			   case 4:
			   {
				   System.out.println("You Have Choosen Singlebed Non AC ");
				   String roomtype4 = "AC";
				   room.setroomType(roomtype4);
				   System.out.println("Enter your Name");
				   String customerName4 = sc.next();
				   customer.set.customername( customerName4);
				   System.out.println("Enter your Age");
				   int customerAge4 = sc.nextInt();
				   customer.set.customerage( customerAge4);
				   System.out.println("Enter your gender ");
				   char customerGender4 = sc.next().charAt(0);
				   customer.set.customergender( customerGender4);
			   }
			    HotelModel hostelView=new HotelModel(roomNumber, roomType );
	        hotelService.addRoomNumber(roomNumber); 
	        hotelService.addRoomType(roomType);
	        }
			}
		}
		
		
	}


=========================================================================

package com.Citrus.hotel.Service;
import com.yadav.hotel.Dao.HotelDao;
import com.yadav.hotel.Model.HotelModel;
public class HotelService 
{
	HotelDao studentDao=new HotelDao();
	int roomNumber;
	String roomType;
	public void addRoomNumber(int roomNumber2)
	{
		this.roomNumber = roomNumber2;

	}
	public void addRoomType(String roomType2)
	{
		this.roomType = roomType;

	}


}
	

}
=============================================================================


package com.Citrus.hotel.Dao;
import com.yadav.hotel.Model.HotelModel;
public class HotelDao 
{
	private static HotelModel[] hostelViewArray = new HotelModel[5];
    static int hostelViewArrayCount = 0;
    public void addHotelNumber() {
	}
    {
    	for(HotelModel h: hostelViewArray)
    	{
    		if(h == null)
    		{
    			HotelDao.hostelViewArray[hostelViewArray] = hotelView;
    			hostelViewArrayCount++;
    			break;
    		}

    	}
    }
}


