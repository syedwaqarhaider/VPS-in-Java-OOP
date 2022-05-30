/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vpaysystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JLabel;

public class CartItem {
//      String CMS_ID;
//      String[] Shop_ID;
//      String[] Quantity;
//      int [] Item_ID;
//      String[] ItemPrice;
//      int noOfItems;
//      String myID;
//      
//      
//          
//      
//      boolean isINconstructor=false;
//      
//      String CCMS_ID;
//      String[] CShop_ID;
//      String[] CQuantity;
//      String[] CItemPrice;
//      int [] CItem_ID;
//  
//
//    public void CartItem(String CMS_ID, String[] Shop_ID, int[] Item_ID, String[] Quantity,String[] ItemPrice, int noOfItems) {
//        
//        
//        this.CMS_ID=CMS_ID;
//        this.Shop_ID= Shop_ID;
//        this.Quantity=Quantity;
//          this.Item_ID=Item_ID;
//          this.ItemPrice=ItemPrice;
//        this.noOfItems=noOfItems;
//       isINconstructor =true;
//    
//        
//    }
//
//    CartItem() {
//        
//    }
//
//    public void display(boolean flag)
//    {
//        
//        Connection con;
//        Statement st;
//        ResultSet rs;
////        
////        Class.forName("oracle.jdbc.driver.OracleDriver");
////            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","bukhari");
////            
//           try
//           {
//             Class.forName("oracle.jdbc.driver.OracleDriver");
//            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","bukhari");
//            
//        if(isINconstructor)
//        {
//        for(int i=0; i<noOfItems; i++)
//        {
//        String sql="insert into purchases values('"+this.CMS_ID+"','"+this.Shop_ID[i]+"',"+this.Item_ID[i]+","+Integer.parseInt(this.Quantity[i])+",sysdate)";
//             st=con.createStatement();
//            rs=st.executeQuery(sql);
//        }
//           
//        }
//        else
//        {
//          for(int i=0; i<noOfItems; i++)
//        {
//          String sql="insert into purchases values('"+this.CCMS_ID+"','"+this.CShop_ID[i]+"',"+this.CItem_ID[i]+","+Integer.parseInt(this.CQuantity[i])+",sysdate)";
//          st=con.createStatement();   
//          rs=st.executeQuery(sql);  
//        }
//          
//        }
//        
//        String sql="Delete from Cart where CMS_ID='"+this.myID+"'";
//        st=con.createStatement();   
//        rs=st.executeQuery(sql);     
//            
//          con.close();
//    }
//            catch(Exception e)
//            {
//                System.out.println("Cart Item Class");
//                System.out.println(e.getMessage());
//            }
//    }
//     public int loadData(String myID)
//    {
//        
//        System.out.println("Yes This Load Data");
//        this.myID=myID;
//        int index=0;
//         Connection con;
//        Statement st;
//        ResultSet rs;
//         try
//            {
//                 Class.forName("oracle.jdbc.driver.OracleDriver");
//            con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","bukhari");
//            
//            String sq2="Select Count(Item_ID) as \"Number\" from CartView where CMS_ID='"+myID+"'";
//               
//             st=con.createStatement();
//            rs=st.executeQuery(sq2);
//               
//            rs.next();
//            noOfItems=rs.getInt("Number");
//            
//            this.CShop_ID=new String[noOfItems];
//             this.CItem_ID=new int[noOfItems];
//              this.CQuantity=new String[noOfItems];
//                this.CItemPrice=new String[noOfItems];
//            
//            String sql="Select * from CartView Where CMS_ID='"+myID+"'";
//             st=con.createStatement();
//            rs=st.executeQuery(sql);
//            
//            while(rs.next())
//            {
//                this.CCMS_ID=myID;
//                this.CItem_ID[index]=rs.getInt("Item_ID");
//                this.CQuantity[index]=Integer.toString(rs.getInt("Quantity"));
//                this.CShop_ID[index]=rs.getString("Shop_ID");
//                this.CItemPrice[index]=Integer.toString(rs.getInt("Price"));
//                index++;
//                        
//                
//                
//            }
//            for(int l=0; l<noOfItems; l++)
//            {
//                System.out.println("Item Price : "+CItemPrice[l]);
//                 System.out.println("Item ID : "+CItem_ID[l]);
//                 System.out.println("Item ID : "+CQuantity[l]);
//            }
//            con.close();
//            }
//            catch(Exception e)
//            {
//                System.out.println(e.getMessage());
//            }
//         return noOfItems;
//
//    }
//     public boolean isBalenceSufficient(JLabel lblbalance)
//     {
//         
//         System.out.println("This is your Current Balance : "+lblbalance.getText());
//         int balance=0;
//         if(isINconstructor)
//         {
//             for(int h=0; h<noOfItems; h++)
//             {
//                
//                 
//                 balance=balance+Integer.parseInt(this.ItemPrice[h])*Integer.parseInt(this.Quantity[h]);
//             }
//         }
//         else
//         {
//             
//             for(int h=0; h<noOfItems; h++)
//             {
//                 
//            
//                System.out.println("Balance Item Price : "+CItemPrice[h]);
//                 System.out.println("Balance Item ID : "+CItemPrice[h]);
//            
//                 balance=balance+Integer.parseInt(this.CItemPrice[h])*Integer.parseInt(this.CQuantity[h]);
//             }
//         }
//         
//         System.out.println("This is Your Total Transaction Balance"+balance);
//         if(balance>Integer.parseInt(lblbalance.getText()))
//         {
//             return false;
//         }
//         else
//         {
//             lblbalance.setText(Integer.toString(Integer.parseInt(lblbalance.getText())-balance));
//             
//             return true;
//         }
//     }
//
//   
//   
//    
}
