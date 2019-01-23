package mypackage;


import java.awt.Robot;
import java.awt.event.KeyEvent;


	
		public class Robo {
		  public static void main(String[] args) throws Exception {
			  
			  String command="notepad.exe";
			  Runtime run= Runtime.getRuntime();

			 
			  run.exec(command);
			  Robot robot =new Robot();
			  

			  
			  robot.delay(1000);                   
			
			  robot.keyPress(KeyEvent.VK_TAB);
			  robot.keyPress(KeyEvent.VK_SHIFT);
			  robot.keyPress(KeyEvent.VK_Q);
			  robot.keyPress(KeyEvent.VK_W);
			  robot.keyPress(KeyEvent.VK_E);
			  robot.keyPress(KeyEvent.VK_R);
			  robot.keyPress(KeyEvent.VK_T);
			  robot.keyPress(KeyEvent.VK_Y);
			  
			  robot.keyRelease(KeyEvent.VK_SHIFT);
			  
			  

			 
			  
		  }
		}





		/*System.out.println(Runtime.getRuntime().freeMemory());
		Runtime.getRuntime().gc();
		System.out.println(Runtime.getRuntime().freeMemory());*/ 
		 

