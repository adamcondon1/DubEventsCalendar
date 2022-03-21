/*
@author adamc x18392911 Dub Events Calendar
 */

package udpechoserver;

//imports
import java.io.*;
import java.net.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import static java.util.Collections.list;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.function.Predicate;


public class UDPServer {

    //packets and sockets vars
    private static final int PORT = 1998;
    private static DatagramSocket DatagramSocket;
    private static DatagramPacket inPacket, outPacket;
    private static byte[] buffer;

    public static void main(String[] args) {  
        //formats for user input declared
        DateTimeFormatter currentDate = DateTimeFormatter.ofPattern("dd/mm/yy");  //format for which to display date
        LocalDateTime now = LocalDateTime.now();
        String date = (currentDate.format(now));
        DateTimeFormatter currentTime = DateTimeFormatter.ofPattern("HH:mm:ss");   //format for which to display time
        System.out.println(currentTime.format(now));
        String time = (currentTime.format(now));
        System.out.println("Opening port...\n");
        try {
            //opening port
            DatagramSocket = new DatagramSocket(PORT); 
        } catch (SocketException e) {
            // catch stating unable to connect
            System.out.println("Unable to attach to port!"); 
            System.exit(1);
        }
        run(date, time);
    }

    private static void run(String date, String time) {
        try {
            //message in = from client message out = from server and number of messages entered
            String messageIn, messageOut;
            int numMessages = 0;

            do {
                buffer = new byte[256]; 		
                inPacket = new DatagramPacket(buffer, buffer.length); 
                DatagramSocket.receive(inPacket);	

                InetAddress clientAddress = inPacket.getAddress();	
                int clientPort = inPacket.getPort();		

                messageIn = new String(inPacket.getData(), 0, inPacket.getLength());	
        
        ArrayList<String> myList = new ArrayList<String>();
        //adds the event typed in the console to the list once typed in the format provided once off
        myList.add(messageIn);

        
         ArrayList<String> mList = new ArrayList<String>();
        //adds the event typed in the console to the list once typed in the format provided once off
            if(messageIn.contains("May")){
        mList.add(messageIn);
        }
        mList.add("14th, May, Clubs Open; 9am;");
        mList.add("15th, May, Staff Night; 11am;");
        mList.add("16th, May, 10km Walk; 10am;");
        mList.add("17th, May, New Astro; 12pm;");
        mList.add("18th, May, Free Travel OAP; 1pm;");
        mList.add("19th, May, Trip to Dublin; 11am;");
        mList.add("20th, May, Night Link; 3am;");
        mList.add("21st, May, Dog Training; 11am;");
        mList.add("22nd, May, Communal Prayers; 9am;");
        mList.add("23rd, May, Fireworks; 6pm;");
      
        
        //Array List storing events         
        ArrayList<String> dList = new ArrayList<String>();
        //adds the event typed in the console to the list once typed in the format provided once off
        if(messageIn.contains("Mar")){
        dList.add(messageIn);
        }
        dList.add("14th, March, Tennis Match; 7am;");
        dList.add("15th, March, Golf Competition; 3pm;");
        dList.add("16th, March, Coffee break; 2pm;");
        dList.add("17th, March, 12km Walk; 12pm;");
        dList.add("18th, March, Trip to Phoenix Park; 8pm;");
        dList.add("19th, March, MMA fight night; 10am;");
        dList.add("20th, March, Party; 9pm;");
        dList.add("21st, March, Swim in sea; 3pm;");
        dList.add("22nd, March, Shopping; 7pm;");
        dList.add("23rd, March, Pub Crawl; 9pm;");
        
        ArrayList<String> aList = new ArrayList<String>();
        //adds the event typed in the console to the list once typed in the format provided once off
        if(messageIn.contains("Apr")){
        aList.add(messageIn);
        }
        aList.add("14th, April, Football Match; 10am;");
        aList.add("15th, April, Bowling; 3pm;");
        aList.add("16th, April, Lunch break; 1pm;");
        aList.add("17th, April, 1km Run; 1pm;");
        aList.add("18th, April, Trip to zoo; 4pm;");
        aList.add("19th, April, Sun Bathing; 10am;");
        aList.add("20th, April, Beach Party; 6pm;");
        aList.add("21st, April, Basketball; 2pm;");
        aList.add("22nd, April, Mini Golf; 5pm;");
        aList.add("23rd, April, Orienteering; 6pm;");
        
          ArrayList<String> jList = new ArrayList<String>();
        //adds the event typed in the console to the list once typed in the format provided once off
        if(messageIn.contains("Jan")){
        jList.add(messageIn);
        }
        jList.add("14th, Jan, Football Golf; 10am;");
        jList.add("15th, Jan, Snooker; 6pm;");
        jList.add("16th, Jan, Holiday break; 1pm;");
        jList.add("17th, Jan, 6km Run; 1pm;");
        
         ArrayList<String> fList = new ArrayList<String>();
        //adds the event typed in the console to the list once typed in the format provided once off
        if(messageIn.contains("Feb")){
        fList.add(messageIn);
        }
        fList.add("14th, Feb, Valentines Day; 10am;");
        fList.add("15th, Feb, Tour of town; 6pm;");
        fList.add("16th, Feb, Hockey; 1pm;");
        
        ArrayList<String> nList = new ArrayList<String>();
        //adds the event typed in the console to the list once typed in the format provided once off
        if(messageIn.contains("Nov")){
        nList.add(messageIn);
        }
        nList.add("14th, Nov, Zumba; 9am;");
        nList.add("15th, Nov, Walk; 5pm;");
        nList.add("16th, Nov, Present Wrapping; 2pm;");
        
         ArrayList<String> oList = new ArrayList<String>();
        //adds the event typed in the console to the list once typed in the format provided once off
        if(messageIn.contains("Oct")){
        nList.add(messageIn);
        }
        oList.add("14th, Oct, Driving Lessons; 9am;");
        oList.add("15th, Oct, Free Drinks; 5pm;");
        oList.add("16th, Oct, Concert; 7pm;");
        
         ArrayList<String> wList = new ArrayList<String>();
        //adds the event typed in the console to the list once typed in the format provided once off
        if(messageIn.contains("Dec")){
        wList.add(messageIn);
        }
        wList.add("24th, Dec, Christmas Eve; 12am;");
        wList.add("25th, Dec, Christmas Day; 12am;");
        wList.add("26th, Dec, Stephens Day; 12am;");
        
        ArrayList<String> uList = new ArrayList<String>();
        //adds the event typed in the console to the list once typed in the format provided once off
        if(messageIn.contains("Jun")){
        uList.add(messageIn);
        }
        uList.add("14th, Jun, Free Ice cream; 12pm;");
        uList.add("25th, Jun,  Party; 7pm;");
        uList.add("16th, Jun, Lazy day; 11am;");
        
         ArrayList<String> yList = new ArrayList<String>();
        //adds the event typed in the console to the list once typed in the format provided once off
        if(messageIn.contains("Jul")){
        yList.add(messageIn);
        }
        yList.add("4th, Jul, Independence day; 12am;");
        yList.add("19th, Jul,  Fight Night; 8pm;");
        yList.add("10th, Jul,  Walk to Howth; 7am;");
        
        ArrayList<String> gList = new ArrayList<String>();
        //adds the event typed in the console to the list once typed in the format provided once off
        if(messageIn.contains("Aug")){
        gList.add(messageIn);
        }
        gList.add("5th, Aug, Gathering; 8am;");
        gList.add("17th, Aug,  Concert; 8pm;");
        gList.add("18th, Aug,  Marathon; 7am;");
        
        ArrayList<String> sList = new ArrayList<String>();
        //adds the event typed in the console to the list once typed in the format provided once off
        if(messageIn.contains("Sep")){
        sList.add(messageIn);
        }
        sList.add("5th, Sep, Youth Club 1pm;");
        sList.add("10th, Sep,  Group Talk; 12pm;");
        sList.add("16th, Sep,  Group Picnic; 6pm;");
        
        
        String example = "11th, May, Anniversary; 9am; true";
        
        //Tokensiser to split input
        StringTokenizer stk = new StringTokenizer(example, ",; ");
        
        String string1 = stk.toString();
        String string2 = stk.nextToken();
        String string3 = stk.nextToken();
        String string4 = stk.nextToken();

        //If Valid It will be split
        boolean validity = Boolean.parseBoolean(stk.nextToken(messageIn));
        
        if (validity){    
            System.out.println(string1);
            System.out.println(string2);
            System.out.println(string3);
            System.out.println(string4);
        } 
        
        //Confirmation the message was recived and stored
        System.out.println("Message stored");
                System.out.println("Message received.");
                if (messageIn.equals("DATE")){
                    messageOut = date;
                } else if (messageIn.equals("date")) {
                    messageOut = date;            

                } else if (messageIn.equals("TIME")) {
                    messageOut = time;
                    
                } else if (messageIn.equals("time")) {
                    messageOut = time;        
                    } 
            
                else{
                    messageOut = ("Message" + ": " + messageIn);
                    System.out.println("All Events Entered and stored : " + myList.toString());
                    }
                
                        if (string3.equals("May")){
                   messageOut = ("Events Taking Part in the Same Month:" +mList); 
                   }
                        if (messageIn.contains("Mar")){
                    messageOut =("Events Taking Part in the Same Month:" +dList); 
                   }
                        if (messageIn.contains("Apr")){
                    messageOut =("Events Taking Part in the Same Month:" +aList); 
                   }
                        if (messageIn.contains("Jan")){
                    messageOut =("Events Taking Part in the Same Month:" +jList); 
                   }
                           if (messageIn.contains("Feb")){
                    messageOut =("Events Taking Part in the Same Month:" +fList); 
                   }
                            if (messageIn.contains("Nov")){
                    messageOut =("Events Taking Part in the Same Month:" +nList); 
                   }
                            if (messageIn.contains("Oct")){
                    messageOut =("Events Taking Part in the Same Month:" +oList); 
                   }
                            if (messageIn.contains("Dec")){
                    messageOut =("Events Taking Part in the Same Month:" +wList); 
                   }
                            if (messageIn.contains("Jun")){
                    messageOut =("Events Taking Part in the Same Month:" +uList); 
                   }
                             if (messageIn.contains("Jul")){
                    messageOut =("Events Taking Part in the Same Month:" +yList); 
                   }
                              if (messageIn.contains("Aug")){
                    messageOut =("Events Taking Part in the Same Month:" +gList); 
                   }
                              if (messageIn.contains("Sep")){
                    messageOut =("Events Taking Part in the Same Month:" +sList); 
                   }
                   
                        
                        
                    
                outPacket = new DatagramPacket(messageOut.getBytes(),
                    messageOut.length(),
                    clientAddress,
                    clientPort);		
                DatagramSocket.send(outPacket);	
            } while (true);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {		//If exception thrown, close connection.
            System.out.println("\n Closing connection... ");
            DatagramSocket.close();				
        }
       }
      }
