class ThreadEx 
{
    public static class BMSDisplayThread extends Thread 
    {
        public void run() 
      {
	    int a=0;
            while (a<5) 
            {
                System.out.println("BMS College of Engineering");
                try 
                {
                    Thread.sleep(200);
                } 
                catch (InterruptedException e) 
                {
                    System.out.println(e);
                }
	            	a=a+1;
            }
        }
    }

    public static class CSEDisplayThread extends Thread 
    {
        public void run() 
      {
	    int b=0;
            while (b<5) 
            {
                System.out.println("CSE");
                try 
                {
                    Thread.sleep(200);
                } 
                catch (Exception e) 
                {
                    System.out.println(e);
                }
		            b=b+1;
            }
        }
    } 
}
class Main
{
    public static void main(String[] args) 
  {
        Thread bmsThread = new ThreadEx.BMSDisplayThread();
        Thread cseThread = new ThreadEx.CSEDisplayThread();
        bmsThread.start();
        cseThread.start();
        System.out.println("B VATSAL");
        System.out.println("1BM23CS061");
    }
}